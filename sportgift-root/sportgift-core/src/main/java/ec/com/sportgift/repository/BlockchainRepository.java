package ec.com.sportgift.repository;

import java.util.Collection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

import ec.com.sportgift.vo.request.TransactionCheckVO;
import ec.com.sportgift.base.JPAQueryDslBaseRepository;
import ec.com.sportgift.entity.BlockchainEntity;
import ec.com.sportgift.entity.QBlockchainEntity;

/**
 * Blockchain repository
 * 
 * @author Christian
 *
 */
@Lazy
@Repository
public class BlockchainRepository  extends JPAQueryDslBaseRepository<BlockchainEntity> implements IBlockchainRepository{

	/**
	 * Constructor
	 * 
	 */
	public BlockchainRepository() {
		super(BlockchainEntity.class);
	}

	/**
	 * Find all blockchains
	 */
	@Override
	public Collection<TransactionCheckVO> findAllBlockchain() {
		QBlockchainEntity qBlockchainEntity = QBlockchainEntity.blockchainEntity;
		
	   JPQLQuery<TransactionCheckVO> query = from(qBlockchainEntity).select(Projections.bean(TransactionCheckVO.class,
			   qBlockchainEntity.id.as("blockchainId"), qBlockchainEntity.javaClass));
       BooleanBuilder where = new BooleanBuilder();
       where.and(qBlockchainEntity.status.eq(Boolean.TRUE));
       query.where(where);
       return query.fetch();
	}



}
