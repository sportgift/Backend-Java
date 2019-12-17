package ec.com.sportgift.repository;

import ec.com.sportgift.vo.request.WalletCredentialsVO;
import ec.com.sportgift.vo.response.WalletVO;
import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.WalletsEntity;

/**
 * WalletsRepository Repository
 * 	
 * @author Christian
 *
 */
public interface IWalletsRepository extends IQueryDslBaseRepository<WalletsEntity> {

    /**
     * 
     * @param id
     * @return
     */
   WalletVO findAllWalletsByIdStore(Integer id);
   
   /**
    * Find wallet by credentials
    * 
    * @param walletCredentialsVO
    * @return
    */
   WalletVO findWalletByCredentials(WalletCredentialsVO walletCredentialsVO);
}
