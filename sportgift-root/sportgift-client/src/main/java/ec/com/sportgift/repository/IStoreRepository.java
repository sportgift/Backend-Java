package ec.com.sportgift.repository;

import ec.com.sportgift.vo.request.CredentialsVO;
import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.response.StoreVO;
import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.StoreEntity;

/**
 * Store Repository
 * 	
 * @author Christian
 *
 */
public interface IStoreRepository extends IQueryDslBaseRepository<StoreEntity> {

	/**
	 * Find store by credentials
	 * 
	 * @param credentialsVO
	 * @return
	 */
	StoreVO  findStoreByCredentials(CredentialsVO credentialsVO);
	
	/**
	 * Find store by some field
	 * 
	 */
	Boolean isExist(StoreQueryVO storeVO);	
	
	
	/**
	 * 
	 * @param storeVO
	 * @return
	 */
	StoreEntity findStoreByParams(StoreQueryVO storeQuery);
	
}
