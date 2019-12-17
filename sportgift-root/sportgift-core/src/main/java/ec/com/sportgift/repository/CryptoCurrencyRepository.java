package ec.com.sportgift.repository;

import java.util.Collection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPQLQuery;

import ec.com.sportgift.base.JPAQueryDslBaseRepository;
import ec.com.sportgift.entity.CryptoCurrencyEntity;
import ec.com.sportgift.entity.QCryptoCurrencyEntity;

/**
 * 
 * @author Christian
 *
 */
@Lazy
@Repository
public class CryptoCurrencyRepository extends JPAQueryDslBaseRepository<CryptoCurrencyEntity> implements ICryptoCurrencyRepository {

	/**
	 * 
	 */
	public CryptoCurrencyRepository() {
		super(CryptoCurrencyEntity.class);
	}
	

	/**
	 * Find all cryptocurrencys
	 * 
	 */
	public Collection<CryptoCurrencyEntity> findCryptoCurrencys(Collection<String> coins) {
		QCryptoCurrencyEntity qCryptoCurrencyEntity = QCryptoCurrencyEntity.cryptoCurrencyEntity;
		
		JPQLQuery<CryptoCurrencyEntity> query = from(qCryptoCurrencyEntity);
		BooleanBuilder where = new BooleanBuilder();
		where.and(qCryptoCurrencyEntity.coinId.in(coins));
		query.where(where);
		return query.fetch();
	}

}
