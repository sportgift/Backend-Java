package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QActionChallengesEntity is a Querydsl query type for ActionChallengesEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QActionChallengesEntity extends EntityPathBase<ActionChallengesEntity> {

    private static final long serialVersionUID = -490547507L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActionChallengesEntity actionChallengesEntity = new QActionChallengesEntity("actionChallengesEntity");

    public final NumberPath<Integer> actionId = createNumber("actionId", Integer.class);

    public final QActionsEntity actionsEntity;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QMeasuredTypeEntity measuredTypeEntity;

    public final QMeasuredTypeEntity measuredTypeEntity1;

    public final QMeasuredTypeEntity measuredTypeEntity2;

    public final NumberPath<Integer> measuredTypeId = createNumber("measuredTypeId", Integer.class);

    public final NumberPath<Integer> measuredTypeRange1Id = createNumber("measuredTypeRange1Id", Integer.class);

    public final NumberPath<Integer> measuredTypeRange2Id = createNumber("measuredTypeRange2Id", Integer.class);

    public final StringPath rangeSymbol = createString("rangeSymbol");

    public final NumberPath<Float> rangeValue1 = createNumber("rangeValue1", Float.class);

    public final NumberPath<Float> rangeValue2 = createNumber("rangeValue2", Float.class);

    public final QRouteEntity routeEntity;

    public final NumberPath<Integer> routeId = createNumber("routeId", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath symbol = createString("symbol");

    public final NumberPath<Float> value = createNumber("value", Float.class);

    public QActionChallengesEntity(String variable) {
        this(ActionChallengesEntity.class, forVariable(variable), INITS);
    }

    public QActionChallengesEntity(Path<? extends ActionChallengesEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QActionChallengesEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QActionChallengesEntity(PathMetadata metadata, PathInits inits) {
        this(ActionChallengesEntity.class, metadata, inits);
    }

    public QActionChallengesEntity(Class<? extends ActionChallengesEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.actionsEntity = inits.isInitialized("actionsEntity") ? new QActionsEntity(forProperty("actionsEntity"), inits.get("actionsEntity")) : null;
        this.measuredTypeEntity = inits.isInitialized("measuredTypeEntity") ? new QMeasuredTypeEntity(forProperty("measuredTypeEntity")) : null;
        this.measuredTypeEntity1 = inits.isInitialized("measuredTypeEntity1") ? new QMeasuredTypeEntity(forProperty("measuredTypeEntity1")) : null;
        this.measuredTypeEntity2 = inits.isInitialized("measuredTypeEntity2") ? new QMeasuredTypeEntity(forProperty("measuredTypeEntity2")) : null;
        this.routeEntity = inits.isInitialized("routeEntity") ? new QRouteEntity(forProperty("routeEntity"), inits.get("routeEntity")) : null;
    }

}

