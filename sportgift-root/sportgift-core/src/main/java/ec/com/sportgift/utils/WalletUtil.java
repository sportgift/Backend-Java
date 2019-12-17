package ec.com.sportgift.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import ec.com.sportgift.vo.response.StoreCryptoCurrenciesVO;
import ec.com.sportgift.vo.response.WalletVO;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Christian
 *
 */
@Slf4j
public class WalletUtil {
    
    private WalletUtil() {

    }

	/**
	 * Generate a Wallet with private key
	 * it depend of type blockchain 
	 * 
	 * @param dataTransaction
	 * @return
	 */
	public static WalletVO generateWallet(StoreCryptoCurrenciesVO dataTransaction) {
		WalletVO walletVO = null;
		String classPackage = "ec.com.cryptogateway.blockchain.service.";
		try {
			Class<?> clase = Class.forName(classPackage.concat(dataTransaction.getJavaClass()));
			Constructor<?> cons1 = clase.getConstructor();
			Method method = clase.getDeclaredMethod("createWallet");
			method.setAccessible(true);
			walletVO = (WalletVO) method.invoke(cons1.newInstance());
		}catch (Exception e) {
			log.error("Error al generar la wallet {}", e.getMessage());
		}
		return walletVO;		
	}
}
