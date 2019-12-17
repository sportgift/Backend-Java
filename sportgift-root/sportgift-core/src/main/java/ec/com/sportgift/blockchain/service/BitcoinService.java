package ec.com.sportgift.blockchain.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import ec.com.sportgift.vo.request.TransactionsVO;
import ec.com.sportgift.vo.response.WalletVO;
import ec.com.sportgift.blockchain.service.IBitcoinService;

/**
 * 
 * @author Christian
 *
 */
@Service
public class BitcoinService implements IBitcoinService{

	@Override
	public WalletVO createWallet() {
		return null;
	}

	@Override
	public void sendCoins() {
		
	}

	@Override
	public Collection<TransactionsVO> checkTransaction(Collection<TransactionsVO> transactions) {
		return null;
	}

	

}
