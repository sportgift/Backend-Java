package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoordinatesRouteEntity is a Querydsl query type for CoordinatesRouteEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoordinatesRouteEntity extends EntityPathBase<CoordinatesRouteEntity> {

    private static final long serialVersionUID = 1293766293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoordinatesRouteEntity coordinatesRouteEntity = new QCoordinatesRouteEntity("coordinatesRouteEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> length = createNumber("length", Double.class);

    public final QRouteEntity routeEntity;

    public final NumberPath<Integer> routeId = createNumber("routeId", Integer.class);

    public QCoordinatesRouteEntity(String variable) {
        this(CoordinatesRouteEntity.class, forVariable(variable), INITS);
    }

    public QCoordinatesRouteEntity(Path<? extends CoordinatesRouteEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoordinatesRouteEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoordinatesRouteEntity(PathMetadata metadata, PathInits inits) {
        this(CoordinatesRouteEntity.class, metadata, inits);
    }

    public QCoordinatesRouteEntity(Class<? extends CoordinatesRouteEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.routeEntity = inits.isInitialized("routeEntity") ? new QRouteEntity(forProperty("routeEntity"), inits.get("routeEntity")) : null;
    }

}

