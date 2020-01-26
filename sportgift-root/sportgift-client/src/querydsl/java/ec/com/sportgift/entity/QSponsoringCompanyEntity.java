package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSponsoringCompanyEntity is a Querydsl query type for SponsoringCompanyEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSponsoringCompanyEntity extends EntityPathBase<SponsoringCompanyEntity> {

    private static final long serialVersionUID = -679289452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSponsoringCompanyEntity sponsoringCompanyEntity = new QSponsoringCompanyEntity("sponsoringCompanyEntity");

    public final StringPath emails = createString("emails");

    public final StringPath facebook = createString("facebook");

    public final StringPath headquartersAddress = createString("headquartersAddress");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath instagram = createString("instagram");

    public final NumberPath<Double> latitudeLocation = createNumber("latitudeLocation", Double.class);

    public final NumberPath<Double> lengthLocation = createNumber("lengthLocation", Double.class);

    public final StringPath logo = createString("logo");

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.util.Date> registrationDate = createDateTime("registrationDate", java.util.Date.class);

    public final StringPath rifRuc = createString("rifRuc");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath twitter = createString("twitter");

    public final NumberPath<Integer> userAccoundId = createNumber("userAccoundId", Integer.class);

    public final QUserAccountEntity userAccountEntity;

    public final StringPath web = createString("web");

    public QSponsoringCompanyEntity(String variable) {
        this(SponsoringCompanyEntity.class, forVariable(variable), INITS);
    }

    public QSponsoringCompanyEntity(Path<? extends SponsoringCompanyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSponsoringCompanyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSponsoringCompanyEntity(PathMetadata metadata, PathInits inits) {
        this(SponsoringCompanyEntity.class, metadata, inits);
    }

    public QSponsoringCompanyEntity(Class<? extends SponsoringCompanyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userAccountEntity = inits.isInitialized("userAccountEntity") ? new QUserAccountEntity(forProperty("userAccountEntity")) : null;
    }

}

