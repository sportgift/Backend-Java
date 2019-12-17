package ec.com.sportgift.repository;

import java.util.Collection;

import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.response.CryptoCurrencyVO;
import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.CryptoCurrencyStoreEntity;

/**
 * CryptoCurrencyStore Repository
 *  
 * @author Christian
 *
 */
public interface ICryptoCurrencyStoreRepository extends IQueryDslBaseRepository<CryptoCurrencyStoreEntity>{

	/**
	 * Get all cryptocurrencies configured by the store
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	Collection<CryptoCurrencyVO> getCryptoCurrencyStore(StoreQueryVO storeQueryVO);
	
	
	/**
	 * Get all cryptocurrencies configured by the store
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	Collection<CryptoCurrencyVO> getAllCryptoCurrencyByStore(StoreQueryVO storeQueryVO);
	
	/**
	 * Delete all cryptocurrency of the store
	 * 
	 * @param storeId
	 * @return
	 */
	boolean deleteAllCryptoCurrencyStore(Integer storeId);
	
	
	/**
	 * Check if the store accept this type cryptocurrency
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	CryptoCurrencyVO checkStoreAcceptCoin(StoreQueryVO storeQueryVO);
	
}
