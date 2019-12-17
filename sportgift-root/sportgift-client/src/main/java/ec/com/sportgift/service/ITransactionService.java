package ec.com.sportgift.service;

import java.util.Collection;

import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.request.TransactionATMVO;
import ec.com.sportgift.vo.request.TransactionsVO;
import ec.com.sportgift.vo.response.ResponseVO;
import ec.com.sportgift.vo.response.TransactionVO;

/**
 * TransactionService Service
 * 
 * @author Christian Domenech
 *
 */
public interface ITransactionService {

	/**
	 * 
	 * @param ResponseVO
	 * @return
	 */
	ResponseVO createTransaction(StoreQueryVO storeQueryVO);
	
	/**
	 * Create an atm transaction
	 * 
	 * @param ResponseVO
	 * @return
	 */
	ResponseVO createTransactionATM(TransactionATMVO transactionATMVO);
	
	/**
	 * Show history of transactions
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	Collection<TransactionVO> showHistory(StoreQueryVO storeQueryVO);
	
	/**
	 * update the transaction
	 * 
	 * @param transactionsVO
	 */
	void updateTransaction(TransactionsVO transactionsVO);
	
	/**
	 * Check transaction 
	 */
	void checkTransaction();
}
