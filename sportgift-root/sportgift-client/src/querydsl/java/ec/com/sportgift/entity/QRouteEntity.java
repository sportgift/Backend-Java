package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRouteEntity is a Querydsl query type for RouteEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRouteEntity extends EntityPathBase<RouteEntity> {

    private static final long serialVersionUID = -490287608L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRouteEntity routeEntity = new QRouteEntity("routeEntity");

    public final QCityEntity cityEntity;

    public final NumberPath<Integer> cityId = createNumber("cityId", Integer.class);

    public final QCountryEntity countryEntity;

    public final NumberPath<Integer> countryId = createNumber("countryId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QRouteEntity(String variable) {
        this(RouteEntity.class, forVariable(variable), INITS);
    }

    public QRouteEntity(Path<? extends RouteEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRouteEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRouteEntity(PathMetadata metadata, PathInits inits) {
        this(RouteEntity.class, metadata, inits);
    }

    public QRouteEntity(Class<? extends RouteEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityEntity = inits.isInitialized("cityEntity") ? new QCityEntity(forProperty("cityEntity"), inits.get("cityEntity")) : null;
        this.countryEntity = inits.isInitialized("countryEntity") ? new QCountryEntity(forProperty("countryEntity")) : null;
    }

}

