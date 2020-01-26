package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdvertisingEntity is a Querydsl query type for AdvertisingEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdvertisingEntity extends EntityPathBase<AdvertisingEntity> {

    private static final long serialVersionUID = 814077347L;

    public static final QAdvertisingEntity advertisingEntity = new QAdvertisingEntity("advertisingEntity");

    public final DateTimePath<java.util.Date> creationDate = createDateTime("creationDate", java.util.Date.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.util.Date> expirationDate = createDateTime("expirationDate", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> rate = createNumber("rate", Integer.class);

    public final NumberPath<Integer> sponsoringCompanyId = createNumber("sponsoringCompanyId", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QAdvertisingEntity(String variable) {
        super(AdvertisingEntity.class, forVariable(variable));
    }

    public QAdvertisingEntity(Path<? extends AdvertisingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdvertisingEntity(PathMetadata metadata) {
        super(AdvertisingEntity.class, metadata);
    }

}

