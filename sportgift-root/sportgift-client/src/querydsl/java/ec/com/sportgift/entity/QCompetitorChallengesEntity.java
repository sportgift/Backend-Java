package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompetitorChallengesEntity is a Querydsl query type for CompetitorChallengesEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompetitorChallengesEntity extends EntityPathBase<CompetitorChallengesEntity> {

    private static final long serialVersionUID = 2101300195L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompetitorChallengesEntity competitorChallengesEntity = new QCompetitorChallengesEntity("competitorChallengesEntity");

    public final QChallengeEntity challengeEntity;

    public final NumberPath<Integer> challengeId = createNumber("challengeId", Integer.class);

    public final QCompetitorEntity competitorEntity;

    public final NumberPath<Integer> competitorId = createNumber("competitorId", Integer.class);

    public final StringPath finalStatus = createString("finalStatus");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> participationDate = createDateTime("participationDate", java.util.Date.class);

    public QCompetitorChallengesEntity(String variable) {
        this(CompetitorChallengesEntity.class, forVariable(variable), INITS);
    }

    public QCompetitorChallengesEntity(Path<? extends CompetitorChallengesEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompetitorChallengesEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompetitorChallengesEntity(PathMetadata metadata, PathInits inits) {
        this(CompetitorChallengesEntity.class, metadata, inits);
    }

    public QCompetitorChallengesEntity(Class<? extends CompetitorChallengesEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.challengeEntity = inits.isInitialized("challengeEntity") ? new QChallengeEntity(forProperty("challengeEntity"), inits.get("challengeEntity")) : null;
        this.competitorEntity = inits.isInitialized("competitorEntity") ? new QCompetitorEntity(forProperty("competitorEntity"), inits.get("competitorEntity")) : null;
    }

}

