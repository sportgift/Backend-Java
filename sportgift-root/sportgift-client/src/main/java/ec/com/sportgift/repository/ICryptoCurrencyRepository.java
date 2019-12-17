package ec.com.sportgift.repository;

import java.util.Collection;

import ec.com.sportgift.base.IQueryDslBaseRepository;
import ec.com.sportgift.entity.CryptoCurrencyEntity;

/**
 * CryptoCurrency Repository
 *  
 * @author Christian
 *
 */
public interface ICryptoCurrencyRepository extends IQueryDslBaseRepository<CryptoCurrencyEntity>  {
	
	/**
	 * Find all cryptocurrencys for id
	 * 
	 * @param coins
	 * @return
	 */
	Collection<CryptoCurrencyEntity> findCryptoCurrencys(Collection<String>  coins);
}
