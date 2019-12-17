package ec.com.sportgift.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.sportgift.vo.request.StoreQueryVO;
import ec.com.sportgift.vo.request.TransactionATMVO;
import ec.com.sportgift.vo.response.ResponseVO;
import ec.com.sportgift.service.ITransactionService;
import ec.com.sportgift.utils.CoreUtils;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * Transaction Controller
 *
 * @author Christian Domenech
 *
 */
@Slf4j
@RequestMapping(value="transaction")
@RestController
public class TransactionController {

	@Autowired
	private final ITransactionService transactionService;
	
	/**
	 * 	
	 * @param transactionService
	 */
	 public TransactionController(ITransactionService transactionService) {
	        this.transactionService = transactionService;
	 }
	 
	/**
	 * 
	 * @param storeQueryVO
	 * @return
	 */
	@PostMapping("createTransaction")
	public Mono<ResponseVO> createTransaction(@RequestBody StoreQueryVO storeQueryVO) {
	    try {		
			return Mono.justOrEmpty(CoreUtils.responseSuccessfull(transactionService.createTransaction(storeQueryVO)));		
		}catch(Exception e) {
			log.error("Exception thown in createTransaction {}",e);			
			 return Mono.justOrEmpty(CoreUtils.responseException(e));			
		}
	}
	
	/**
	 * 
	 * @param transactionATMVO
	 * @return
	 */
	@PostMapping("createTransactionATM")
	public Mono<ResponseVO> createTransactionATM(@RequestBody TransactionATMVO transactionATMVO) {
	    try {		
			return Mono.justOrEmpty(CoreUtils.responseSuccessfull(transactionService.createTransactionATM(transactionATMVO)));		
		}catch(Exception e) {
			log.error("Exception thown in createTransactionATM {}",e);			
			 return Mono.justOrEmpty(CoreUtils.responseException(e));			
		}
	}
	
	/**
	 * 
	 */
	@PostMapping("checkTransaction")
	public void checkTransaction() {
	    try {		
			transactionService.checkTransaction();		
		}catch(Exception e) {
			log.error("Exception thown in checkTransaction {}",e);		
		}
	}
}
