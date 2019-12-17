package ec.com.sportgift.service;

import java.util.List;

import ec.com.sportgift.vo.request.CredentialsVO;
import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.request.StoreSaveVO;
import ec.com.sportgift.vo.request.StoreUpdateVO;
import ec.com.sportgift.vo.response.CryptoCurrencyVO;
import ec.com.sportgift.vo.response.ResponseVO;
import ec.com.sportgift.vo.response.StoreCryptoCurrenciesVO;

/**
 * Store Service
 * 
 * @author Christian
 *
 */
public interface IStoreService{
	
	
	/**
	 * List all cryptocurrencys of store
	 * 
	 * @param storeQueryVO
	 * @return
	 */
    List<StoreCryptoCurrenciesVO> findCoinsForUIstore(StoreQueryVO storeQueryVO);
    
    /**
     * List All cryptocurrencys of the store
     * and calculate the price
     * 
     * @param storeQueryVO
     * @return
     */
    ResponseVO findCoinsByUIstore(StoreQueryVO storeQueryVO);
    
    /**
     * List All cryptocurrencys of the store
     * 
     * @param storeQueryVO
     * @return
     */
    ResponseVO findAllCoinsForUIstore(StoreQueryVO storeQueryVO);
    
    /**
     * Find a user by credentials
     * 
     * @param credentialsVO
     * @return
     */
    ResponseVO findUserByCredentials(CredentialsVO credentialsVO);
    
    /**
     * Save the store
     * 
     * @param storeSaveVO
     */
    ResponseVO saveStore(StoreSaveVO storeSaveVO);
    
   
    /**
     * Resend the password
     * 
     * @param credentialsVO
     * @return
     */
    ResponseVO resendPassword(StoreQueryVO storeQueryVO);
    
    /**
     * Save configuration of coins for the store
     * 
     * @param coins
     * @return
     */
    ResponseVO saveCoinsConfiguration(CryptoCurrencyVO coins);
    
    /**
     * Update the store
     * 
     * @param storeUpdateVO
     * @return
     */
    ResponseVO updateStore(StoreUpdateVO storeUpdateVO);
}
