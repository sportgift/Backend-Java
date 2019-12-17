package ec.com.sportgift.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import ec.com.sportgift.vo.request.CredentialsVO;
import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.request.StoreSaveVO;
import ec.com.sportgift.vo.request.StoreUpdateVO;
import ec.com.sportgift.vo.response.CryptoCurrencyVO;
import ec.com.sportgift.vo.response.ResponseVO;
import ec.com.sportgift.vo.response.StoreCryptoCurrenciesVO;
import ec.com.sportgift.vo.response.StoreVO;
import ec.com.sportgift.entity.CryptoCurrencyEntity;
import ec.com.sportgift.entity.CryptoCurrencyStoreEntity;
import ec.com.sportgift.entity.StoreEntity;
import ec.com.sportgift.utils.ApisUtil;
import ec.com.sportgift.utils.SportgiftConstants;
import ec.com.sportgift.repository.ICryptoCurrencyRepository;
import ec.com.sportgift.repository.ICryptoCurrencyStoreRepository;
import ec.com.sportgift.repository.IStoreRepository;
import ec.com.sportgift.utils.AES256;
import ec.com.sportgift.utils.CoreUtils;

/**
 * Store Service
 * 
 * @author Christian
 *
 */
@Transactional
@Service
public class StoreService implements IStoreService{
    
    @Autowired
    private IStoreRepository storeRepository;
    
    @Autowired
    private ICryptoCurrencyRepository cryptoCurrencyRepository;
    
    @Autowired
    private ICryptoCurrencyStoreRepository cryptoCurrencyStoreRepository;
    
    @Autowired
    IEmailService emailService;

   
    /**
     * Find all information of the cryptoCurrency
     * of the stores
     * 
     */
	@Override
	public List<StoreCryptoCurrenciesVO> findCoinsForUIstore(StoreQueryVO storeQueryVO) {
		ArrayList<StoreCryptoCurrenciesVO> storeCryptoCurrencies= new ArrayList<>();
		Collection<CryptoCurrencyVO> cryptoCurrency = cryptoCurrencyStoreRepository.getCryptoCurrencyStore(storeQueryVO);			 	
		if(!CollectionUtils.isEmpty(cryptoCurrency)){
			cryptoCurrency.forEach(data -> {
				ApisUtil.getApiInformation(data, storeQueryVO, storeCryptoCurrencies);
			});	
		}	
		
		return storeCryptoCurrencies;		
		
	}
	
    /**
     * List all cryptocurrencys of the store
     * 
     * @param storeQueryVO
     * @return
     */
	@Override
	public ResponseVO findCoinsByUIstore(StoreQueryVO storeQueryVO) {
			
		if(storeQueryVO==null || storeQueryVO.getStoreUI()== null)
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_STORE_NOT_FOUND);	
		
		List<StoreCryptoCurrenciesVO> storeCryptoCurrencies= findCoinsForUIstore(storeQueryVO);
		
		if(!storeCryptoCurrencies.isEmpty()) {		
			return new ResponseVO(SportgiftConstants.FULL_LIST, null, storeCryptoCurrencies);	
		}else {	
			return new ResponseVO(SportgiftConstants.EMPTY_LIST, SportgiftConstants.MESSAGE_STORE_COINS_CONFIGURATION, storeCryptoCurrencies);
		}

	}
	
	/**
     * List all cryptocurrencys of the store
     * 
     * @param storeQueryVO
     * @return
     */
	@Override
	public ResponseVO findAllCoinsForUIstore(StoreQueryVO storeQueryVO) {
			
		if(storeQueryVO==null || storeQueryVO.getStoreUI()== null)
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_STORE_NOT_FOUND);			
	
		Collection<CryptoCurrencyVO> cryptoCurrencys = cryptoCurrencyStoreRepository.getAllCryptoCurrencyByStore(storeQueryVO);	
		
		if(!cryptoCurrencys.isEmpty()) {		
			return new ResponseVO(SportgiftConstants.FULL_LIST, null, cryptoCurrencys);	
		}else {	
			return new ResponseVO(SportgiftConstants.EMPTY_LIST, SportgiftConstants.MESSAGE_STORE_COINS_CONFIGURATION, cryptoCurrencys);
		}

	}
	
	

	/**
	 * Find user by credentials
	 * 
	 */
	@Override
	public ResponseVO findUserByCredentials(CredentialsVO credentialsVO) {	
		
		StoreVO storeVO = storeRepository.findStoreByCredentials(credentialsVO);		
		ResponseVO responseVO;
		if(storeVO!=null) {			
			responseVO =  new ResponseVO( SportgiftConstants.STATUS_SUCCESSFULL,SportgiftConstants.MESSAGE_SUCCESSFULL_USER_FOUND);						
		}else {
			responseVO =  new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_USER_NOT_FOUND);			
		}
		return responseVO;
	}

	/**
	 * Save the store
	 * 
	 * @param storeSaveVO
	 * @return
	 */
	@Override
	public ResponseVO saveStore(StoreSaveVO storeSaveVO) {
		
		ResponseVO responseValidation = validateStorePatterns(storeSaveVO);
		if(responseValidation!=null) {
			return responseValidation;
		}
		
		ResponseVO responseExistStore = validateIfExistStore(storeSaveVO);
		if(responseExistStore!=null) {
			return responseExistStore;
		}
				
		StoreEntity storeEntity = new StoreEntity();
		storeEntity.setCreationDate(new Date());
		storeEntity.setEmail(storeSaveVO.getEmail());
		storeEntity.setUser(storeSaveVO.getUser());
		storeEntity.setStoreName(storeSaveVO.getStoreName());
		storeEntity.setPassword(AES256.encrypt(storeSaveVO.getPassword(), AES256.SECRET_KEY));
		storeEntity.setStoreUI(CoreUtils.createIdentifierRandom(12).toUpperCase());			
		storeRepository.save(storeEntity);
		
		//send Email
		emailService.sendMail(null);
	
		return new ResponseVO(SportgiftConstants.STATUS_SUCCESSFULL, SportgiftConstants.MESSAGE_SUCCESSFULL_STORE_SAVED);
	}
	
	
	/**
	 * Validate if store exist
	 * 
	 * @param storeSaveVO
	 */
	private ResponseVO validateIfExistStore(StoreSaveVO storeSaveVO) {
		
		ResponseVO responseVO = null;
		
		Collection<String> errorsList = new ArrayList<>();
		
		/* Validate if the store exist  */
		StoreQueryVO storeQueryVO = new StoreQueryVO();
		storeQueryVO.setEmail(storeSaveVO.getEmail());		
		if(storeRepository.isExist(storeQueryVO).booleanValue()) {
			errorsList.add(SportgiftConstants.EMAIL_EXIST);			
		}
		
		storeQueryVO = new StoreQueryVO();
		storeQueryVO.setUser(storeSaveVO.getUser());
		if(storeRepository.isExist(storeQueryVO).booleanValue()) {
			errorsList.add(SportgiftConstants.USER_EXIST);					
		}
		
		storeQueryVO = new StoreQueryVO();
		storeQueryVO.setStoreName(storeSaveVO.getStoreName());
		if(storeRepository.isExist(storeQueryVO).booleanValue()) {
			errorsList.add(SportgiftConstants.STORE_NAME_EXIST);		
		}
		
		if(!errorsList.isEmpty()) {
			responseVO =  new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_VALIDATION_WARNING,null,errorsList);
		}
		
		return responseVO;
	}

	/**
	 * Validate patterns of fields
	 * 
	 * @param storeSaveVO
	 */
	private ResponseVO validateStorePatterns(StoreSaveVO storeSaveVO) {
		
		ResponseVO responseVO = null;
		
		Collection<String> warningList = new ArrayList<String>();
		
		/* Validate patterns */
		if(StringUtils.isEmpty(storeSaveVO.getPassword()) || !CoreUtils.validatePassword(storeSaveVO.getPassword())) {
			warningList.add(SportgiftConstants.INVALID_PASSWORD);
		}
		
		if(!storeSaveVO.getPassword().equals(storeSaveVO.getRepeatPassword())){
			warningList.add(SportgiftConstants.DIFFERENT_PASSWORD);
		}
		
		if(StringUtils.isEmpty(storeSaveVO.getEmail()) || !CoreUtils.validateEmail(storeSaveVO.getEmail())) {
			warningList.add(SportgiftConstants.INVALID_EMAIL);
		}
		
		if(StringUtils.isEmpty(storeSaveVO.getUser()) || !CoreUtils.validateUser(storeSaveVO.getUser())) {
			warningList.add(SportgiftConstants.INVALID_USER);
		}
		
		if(StringUtils.isEmpty(storeSaveVO.getStoreName()) ||  !CoreUtils.validateStoreName(storeSaveVO.getStoreName())) {
			warningList.add(SportgiftConstants.INVALID_STORE_NAME);
		}
		
		if(warningList.size()>0) {
			responseVO =  new ResponseVO(SportgiftConstants.STATUS_WARNING,	SportgiftConstants.MESSAGE_VALIDATION_WARNING,warningList,null);
		}
		
		return responseVO;
	}


	/**
	 * Resend the password
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	@Override
	public ResponseVO resendPassword(StoreQueryVO storeQueryVO) {
		
		StoreEntity storeEntity = storeRepository.findStoreByParams(storeQueryVO);
		if(storeEntity==null) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_STORE_NOT_FOUND);	
		}else {
			
			String password = AES256.decrypt(storeEntity.getPassword(), AES256.SECRET_KEY);						

			//send Email
	        emailService.sendMail(null);
			
			return new ResponseVO(SportgiftConstants.STATUS_SUCCESSFULL, 
					SportgiftConstants.MESSAGE_SUCCESSFULL_STORE_UPDATED);
		}

	}

	/**
	 * Save coins to the store
	 * 
	 * @param coins
	 * @return
	 */
	@Override
	public ResponseVO saveCoinsConfiguration(CryptoCurrencyVO cryptoCurrencyVO) {
		
		/* Id sera tomado de la sesion cuando se implement spring security*/
		StoreQueryVO storeQueryVO = new StoreQueryVO();
		storeQueryVO.setId(cryptoCurrencyVO.getIdStore());
		
		StoreEntity storeEntity = storeRepository.findStoreByParams(storeQueryVO);
		if(storeEntity==null) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_STORE_NOT_FOUND);	
		}
		
		if(CollectionUtils.isEmpty(cryptoCurrencyVO.getCoins())) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_COINS_NOT_FOUND);			
		}
		
		Collection<CryptoCurrencyEntity> cryptoCurrency = cryptoCurrencyRepository.findCryptoCurrencys(cryptoCurrencyVO.getCoins());
		if(CollectionUtils.isEmpty(cryptoCurrency)) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_COINS_NOT_FOUND);			
		}else{
			
			cryptoCurrencyStoreRepository.deleteAllCryptoCurrencyStore(storeEntity.getId());
			cryptoCurrency.forEach(data->{
				CryptoCurrencyStoreEntity cryptoCurrencyStoreEntity = new CryptoCurrencyStoreEntity();
				cryptoCurrencyStoreEntity.setCryptoCurrencyId(data.getId());
				cryptoCurrencyStoreEntity.setStoreId(storeEntity.getId());
				cryptoCurrencyStoreEntity.setStatus(Boolean.TRUE);
				cryptoCurrencyStoreRepository.save(cryptoCurrencyStoreEntity);				
			});
			
			return new ResponseVO(SportgiftConstants.STATUS_SUCCESSFULL, SportgiftConstants.MESSAGE_SUCCESSFULL_COIN_STORE_SAVED);
		}
	}

	/**
	 * Actualiza la tienda
	 * 
	 * @param storeUpdateVO
	 * @return
	 */
	@Override
	public ResponseVO updateStore(StoreUpdateVO storeUpdateVO) {
		
		/* Id sera tomado de la sesion cuando se implement spring security*/
		StoreQueryVO storeQueryVO = new StoreQueryVO();
		storeQueryVO.setId(storeUpdateVO.getId());
		
		if(storeUpdateVO.getId() == null) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_DATOS_REQUERIDOS);	
		}
		
		StoreEntity storeEntity = storeRepository.findStoreByParams(storeQueryVO);
		if(storeEntity==null) {
			return new ResponseVO(SportgiftConstants.STATUS_ERROR, SportgiftConstants.MESSAGE_ERROR_STORE_NOT_FOUND);	
		}else {
			StoreSaveVO storeSaveVO =new StoreSaveVO();
			storeSaveVO.setEmail(storeEntity.getEmail());
			
			storeSaveVO.setPassword(storeUpdateVO.getPassword());
			storeSaveVO.setRepeatPassword(storeUpdateVO.getRepeatPassword());
			
			storeSaveVO.setStoreName(storeUpdateVO.getStoreName());
			storeSaveVO.setUser(storeEntity.getUser());		
			
			ResponseVO responseValidation = validateStorePatterns(storeSaveVO);
			if(responseValidation!=null) {
				return responseValidation;
			}
			
			storeEntity.setStoreName(storeUpdateVO.getStoreName());
			storeSaveVO.setPassword(AES256.encrypt(storeUpdateVO.getPassword(), AES256.SECRET_KEY));
			
			storeRepository.update(storeEntity);
			
			//send Email
	        emailService.sendMail(null);
				
			return new ResponseVO(SportgiftConstants.STATUS_SUCCESSFULL, SportgiftConstants.MESSAGE_SUCCESSFULL_STORE_UPDATED);
			
		}
	}

}
