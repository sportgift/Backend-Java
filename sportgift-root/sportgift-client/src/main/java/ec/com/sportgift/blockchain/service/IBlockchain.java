package ec.com.sportgift.blockchain.service;

import java.util.Collection;

import ec.com.sportgift.vo.request.TransactionsVO;
import ec.com.sportgift.vo.response.WalletVO;

/**
 * 
 * @author Christian
 *
 */
public interface IBlockchain {
	
	/**
	 * Create wallet
	 * 
	 * @return
	 */
	WalletVO createWallet();
	
	/**
	 * Check transaction
	 * 
	 */
	Collection<TransactionsVO> checkTransaction(Collection<TransactionsVO> transactions);
	
	/**
	 * Send coins to wallet
	 * 
	 */
	void sendCoins();

}
