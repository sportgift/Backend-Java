package ec.com.sportgift.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.sportgift.vo.response.WalletVO;
import ec.com.sportgift.repository.IWalletsRepository;

/**
 * Wallet service
 * 
 * @author Christian
 *
 */
@Service
@Transactional
public class WalletService implements IWalletService{
    
    @Autowired
    IWalletsRepository walletsRepository;

    /**
     * Find all wallets by Id Store
     */
    @Override
    public WalletVO findAllWalletsByIdStore(Integer id) {       
        return walletsRepository.findAllWalletsByIdStore(id);
    }

}
