package ec.com.sportgift.repository;

import java.util.Collection;

import ec.com.sportgift.vo.request.TransactionsVO;
import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.TransactionEntity;

/**
 * TransactionRepository Repository
 * 	
 * @author Christian
 *
 */
public interface ITransactionRepository extends  IQueryDslBaseRepository<TransactionEntity> {

	/**
	 * Find all transactions
	 * 
	 * @return
	 */
	Collection<TransactionsVO> findAllTransactions();
	
	/**
	 * Update transaction
	 * 
	 * @param transactionEntity
	 */
	void updateTransaction(TransactionEntity transactionEntity);
	
} 
