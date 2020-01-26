package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityEntity is a Querydsl query type for CityEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCityEntity extends EntityPathBase<CityEntity> {

    private static final long serialVersionUID = 768657202L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityEntity cityEntity = new QCityEntity("cityEntity");

    public final QCountryEntity countryEntity;

    public final NumberPath<Integer> countryId = createNumber("countryId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QCityEntity(String variable) {
        this(CityEntity.class, forVariable(variable), INITS);
    }

    public QCityEntity(Path<? extends CityEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityEntity(PathMetadata metadata, PathInits inits) {
        this(CityEntity.class, metadata, inits);
    }

    public QCityEntity(Class<? extends CityEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.countryEntity = inits.isInitialized("countryEntity") ? new QCountryEntity(forProperty("countryEntity")) : null;
    }

}

