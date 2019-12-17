package ec.com.sportgift.service;

import ec.com.sportgift.vo.response.WalletVO;

public interface IWalletService {

    WalletVO findAllWalletsByIdStore(Integer id);
    
}
