package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCompetitorAwardsEntity is a Querydsl query type for CompetitorAwardsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompetitorAwardsEntity extends EntityPathBase<CompetitorAwardsEntity> {

    private static final long serialVersionUID = 1731442857L;

    public static final QCompetitorAwardsEntity competitorAwardsEntity = new QCompetitorAwardsEntity("competitorAwardsEntity");

    public final NumberPath<Integer> competitorChallengeId = createNumber("competitorChallengeId", Integer.class);

    public final NumberPath<Integer> competitorId = createNumber("competitorId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> promotionsAwardsId = createNumber("promotionsAwardsId", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QCompetitorAwardsEntity(String variable) {
        super(CompetitorAwardsEntity.class, forVariable(variable));
    }

    public QCompetitorAwardsEntity(Path<? extends CompetitorAwardsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompetitorAwardsEntity(PathMetadata metadata) {
        super(CompetitorAwardsEntity.class, metadata);
    }

}

