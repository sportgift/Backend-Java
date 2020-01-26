package ec.com.sportgift.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import ec.com.sportgift.base.JPAQueryDslBaseRepository;
import ec.com.sportgift.entity.WalletsEntity;
import ec.com.sportgift.vo.request.WalletCredentialsVO;
import ec.com.sportgift.vo.response.WalletVO;

@Lazy
@Repository
public class WalletsRepository extends JPAQueryDslBaseRepository<WalletsEntity> implements IWalletsRepository {

    public WalletsRepository() {
        super(WalletsEntity.class);
    }

	@Override
	public WalletVO findAllWalletsByIdStore(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WalletVO findWalletByCredentials(WalletCredentialsVO walletCredentialsVO) {
		// TODO Auto-generated method stub
		return null;
	}


}
