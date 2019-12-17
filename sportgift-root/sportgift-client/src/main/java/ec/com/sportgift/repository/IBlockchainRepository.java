package ec.com.sportgift.repository;

import java.util.Collection;

import ec.com.sportgift.vo.request.TransactionCheckVO;
import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.BlockchainEntity;

/**
 * Interface of Blockchain Repository
 * 
 * @author Christian
 *
 */
public interface IBlockchainRepository extends IQueryDslBaseRepository<BlockchainEntity> {

	/**
	 * Find all Blockchain
	 * 
	 * @return
	 */
	Collection<TransactionCheckVO> findAllBlockchain();
	
}
