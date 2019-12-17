package ec.com.sportgift.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.response.WalletVO;
import ec.com.sportgift.service.IWalletService;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Christian
 *
 */
@RequestMapping(value="wallet")
@RestController
public class WalletController {
    
    @Autowired
    private final IWalletService walletService;
    
    public WalletController(IWalletService walletService) {
        this.walletService = walletService;
    }    
    
   @PostMapping("query")
   public Mono<WalletVO> query(@RequestBody StoreQueryVO storeQueryVO) {
       return Mono.justOrEmpty(walletService.findAllWalletsByIdStore(storeQueryVO.getId()));
   }   
}
