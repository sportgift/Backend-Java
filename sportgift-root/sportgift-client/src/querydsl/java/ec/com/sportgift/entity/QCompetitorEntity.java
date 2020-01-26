package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompetitorEntity is a Querydsl query type for CompetitorEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompetitorEntity extends EntityPathBase<CompetitorEntity> {

    private static final long serialVersionUID = -1074073773L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompetitorEntity competitorEntity = new QCompetitorEntity("competitorEntity");

    public final StringPath address = createString("address");

    public final StringPath avatar = createString("avatar");

    public final DatePath<java.time.LocalDate> birthDate = createDate("birthDate", java.time.LocalDate.class);

    public final QCityEntity cityEntity;

    public final NumberPath<Integer> cityId = createNumber("cityId", Integer.class);

    public final QCountryEntity countryEntity;

    public final NumberPath<Integer> countryId = createNumber("countryId", Integer.class);

    public final StringPath email = createString("email");

    public final StringPath facebook = createString("facebook");

    public final ComparablePath<Character> gender = createComparable("gender", Character.class);

    public final NumberPath<Float> height = createNumber("height", Float.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath instagram = createString("instagram");

    public final StringPath name = createString("name");

    public final DateTimePath<java.util.Date> registrationDate = createDateTime("registrationDate", java.util.Date.class);

    public final StringPath snapchat = createString("snapchat");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath twitter = createString("twitter");

    public final QUserAccountEntity userAccountEntity;

    public final NumberPath<Integer> userAccountId = createNumber("userAccountId", Integer.class);

    public final NumberPath<Float> weight = createNumber("weight", Float.class);

    public QCompetitorEntity(String variable) {
        this(CompetitorEntity.class, forVariable(variable), INITS);
    }

    public QCompetitorEntity(Path<? extends CompetitorEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompetitorEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompetitorEntity(PathMetadata metadata, PathInits inits) {
        this(CompetitorEntity.class, metadata, inits);
    }

    public QCompetitorEntity(Class<? extends CompetitorEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityEntity = inits.isInitialized("cityEntity") ? new QCityEntity(forProperty("cityEntity"), inits.get("cityEntity")) : null;
        this.countryEntity = inits.isInitialized("countryEntity") ? new QCountryEntity(forProperty("countryEntity")) : null;
        this.userAccountEntity = inits.isInitialized("userAccountEntity") ? new QUserAccountEntity(forProperty("userAccountEntity")) : null;
    }

}

