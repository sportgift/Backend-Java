package ec.com.sportgift.repository;

import java.util.Collection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

import ec.com.sportgift.vo.request.TransactionsVO;
import ec.com.sportgift.base.JPAQueryDslBaseRepository;
import ec.com.sportgift.entity.QCryptoCurrencyEntity;
import ec.com.sportgift.entity.QStoreEntity;
import ec.com.sportgift.entity.QTransactionEntity;
import ec.com.sportgift.entity.QWalletsEntity;
import ec.com.sportgift.entity.TransactionEntity;
import ec.com.sportgift.utils.SportgiftConstants;

/**
 * Transaction Repository
 * 
 * @author Christian
 *
 */
@Lazy
@Repository
public class TransactionRepository extends JPAQueryDslBaseRepository<TransactionEntity> implements ITransactionRepository  {

	/**
	 * 
	 */
	public TransactionRepository() {
		super(TransactionEntity.class);
	}

	/**
	 * Find all transactions
	 */
	@Override
	public Collection<TransactionsVO> findAllTransactions() {
		
		QTransactionEntity qTransactionEntity = QTransactionEntity.transactionEntity;
		QWalletsEntity qWalletEntity = QWalletsEntity.walletsEntity;
		QCryptoCurrencyEntity qCryptoCurrencyEntity = QCryptoCurrencyEntity.cryptoCurrencyEntity;
		QStoreEntity qStoreEntity = QStoreEntity.storeEntity;
		
		JPQLQuery<TransactionsVO> query = from(qTransactionEntity).select(Projections.bean(TransactionsVO.class,
				  qTransactionEntity.id.as("transactionId"), qTransactionEntity.blockchainId,
				  qTransactionEntity.coinsAmount, qTransactionEntity.timeoutTransaction, 
				  qTransactionEntity.numberOfChecks, qWalletEntity.wallet, 
				  qWalletEntity.privateKey, qWalletEntity.publicKey,
				  qCryptoCurrencyEntity.smartContract, qStoreEntity.email, qStoreEntity.id.as("storeId")));
		     
	     query.innerJoin(qTransactionEntity.wallet, qWalletEntity);
	     query.innerJoin(qTransactionEntity.cryptoCurrency, qCryptoCurrencyEntity);
	     query.innerJoin(qTransactionEntity.store, qStoreEntity);
	     query.orderBy(qTransactionEntity.blockchainId.desc());
	     BooleanBuilder where = new BooleanBuilder();
	    
	     where.and(qTransactionEntity.transactionStatusId.eq(SportgiftConstants.STATUS_TRANSACTION_WAITING));
	     query.where(where);
	     
	     return query.fetch();
		
	}

	/**
	 * Update transaction
	 * 
	 */
    @Override
    public void updateTransaction(TransactionEntity transactionEntity) {
        QTransactionEntity qTransactionEntity = QTransactionEntity.transactionEntity;
        BooleanBuilder where = new BooleanBuilder();
        where.and(qTransactionEntity.id.eq(transactionEntity.getId()));
        update(qTransactionEntity).where(where)
        .set(qTransactionEntity.coinsReceived, transactionEntity.getCoinsReceived())
        .set(qTransactionEntity.lastCheckDate, transactionEntity.getLastCheckDate())
        .set(qTransactionEntity.numberOfChecks, transactionEntity.getNumberOfChecks())       
         .set(qTransactionEntity.transactionStatusId, transactionEntity.getTransactionStatusId()).execute();

        
    }
}
