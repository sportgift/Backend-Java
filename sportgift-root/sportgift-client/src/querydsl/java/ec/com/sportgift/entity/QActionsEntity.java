package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QActionsEntity is a Querydsl query type for ActionsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QActionsEntity extends EntityPathBase<ActionsEntity> {

    private static final long serialVersionUID = 730193596L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActionsEntity actionsEntity = new QActionsEntity("actionsEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sportId = createNumber("sportId", Integer.class);

    public final QSportsEntity sportsEntity;

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QActionsEntity(String variable) {
        this(ActionsEntity.class, forVariable(variable), INITS);
    }

    public QActionsEntity(Path<? extends ActionsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QActionsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QActionsEntity(PathMetadata metadata, PathInits inits) {
        this(ActionsEntity.class, metadata, inits);
    }

    public QActionsEntity(Class<? extends ActionsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sportsEntity = inits.isInitialized("sportsEntity") ? new QSportsEntity(forProperty("sportsEntity")) : null;
    }

}

