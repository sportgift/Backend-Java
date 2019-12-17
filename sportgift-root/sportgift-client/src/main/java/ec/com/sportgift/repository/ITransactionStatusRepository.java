package ec.com.sportgift.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.sportgift.entity.TransactionStatusEntity;


/**
 * TransactionStatusRepository Repository
 * 	
 * @author Christian
 *
 */
public interface ITransactionStatusRepository extends JpaRepository<TransactionStatusEntity,Integer>{

}
