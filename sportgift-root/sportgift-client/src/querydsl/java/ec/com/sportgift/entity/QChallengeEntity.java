package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChallengeEntity is a Querydsl query type for ChallengeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChallengeEntity extends EntityPathBase<ChallengeEntity> {

    private static final long serialVersionUID = 1194950306L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChallengeEntity challengeEntity = new QChallengeEntity("challengeEntity");

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> maximumParticipants = createNumber("maximumParticipants", Integer.class);

    public final StringPath name = createString("name");

    public final QSponsoringCompanyEntity sponsoringCompanyEntity;

    public final NumberPath<Integer> sponsoringCompanyId = createNumber("sponsoringCompanyId", Integer.class);

    public final NumberPath<Integer> sportId = createNumber("sportId", Integer.class);

    public final QSportsEntity sportsEntity;

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public QChallengeEntity(String variable) {
        this(ChallengeEntity.class, forVariable(variable), INITS);
    }

    public QChallengeEntity(Path<? extends ChallengeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChallengeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChallengeEntity(PathMetadata metadata, PathInits inits) {
        this(ChallengeEntity.class, metadata, inits);
    }

    public QChallengeEntity(Class<? extends ChallengeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sponsoringCompanyEntity = inits.isInitialized("sponsoringCompanyEntity") ? new QSponsoringCompanyEntity(forProperty("sponsoringCompanyEntity"), inits.get("sponsoringCompanyEntity")) : null;
        this.sportsEntity = inits.isInitialized("sportsEntity") ? new QSportsEntity(forProperty("sportsEntity")) : null;
    }

}

