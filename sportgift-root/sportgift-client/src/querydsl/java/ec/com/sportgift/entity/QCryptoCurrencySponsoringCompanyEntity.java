package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCryptoCurrencySponsoringCompanyEntity is a Querydsl query type for CryptoCurrencySponsoringCompanyEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCryptoCurrencySponsoringCompanyEntity extends EntityPathBase<CryptoCurrencySponsoringCompanyEntity> {

    private static final long serialVersionUID = 1433200706L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCryptoCurrencySponsoringCompanyEntity cryptoCurrencySponsoringCompanyEntity = new QCryptoCurrencySponsoringCompanyEntity("cryptoCurrencySponsoringCompanyEntity");

    public final QCryptoCurrencyEntity cryptocurrencyEntity;

    public final NumberPath<Integer> cryptoCurrencyId = createNumber("cryptoCurrencyId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QSponsoringCompanyEntity sponsoringCompanyEntity;

    public final NumberPath<Integer> sponsoringCompanyId = createNumber("sponsoringCompanyId", Integer.class);

    public final BooleanPath status = createBoolean("status");

    public QCryptoCurrencySponsoringCompanyEntity(String variable) {
        this(CryptoCurrencySponsoringCompanyEntity.class, forVariable(variable), INITS);
    }

    public QCryptoCurrencySponsoringCompanyEntity(Path<? extends CryptoCurrencySponsoringCompanyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCryptoCurrencySponsoringCompanyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCryptoCurrencySponsoringCompanyEntity(PathMetadata metadata, PathInits inits) {
        this(CryptoCurrencySponsoringCompanyEntity.class, metadata, inits);
    }

    public QCryptoCurrencySponsoringCompanyEntity(Class<? extends CryptoCurrencySponsoringCompanyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cryptocurrencyEntity = inits.isInitialized("cryptocurrencyEntity") ? new QCryptoCurrencyEntity(forProperty("cryptocurrencyEntity"), inits.get("cryptocurrencyEntity")) : null;
        this.sponsoringCompanyEntity = inits.isInitialized("sponsoringCompanyEntity") ? new QSponsoringCompanyEntity(forProperty("sponsoringCompanyEntity"), inits.get("sponsoringCompanyEntity")) : null;
    }

}

