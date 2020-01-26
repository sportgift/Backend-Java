package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMeasuredTypeEntity is a Querydsl query type for MeasuredTypeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMeasuredTypeEntity extends EntityPathBase<MeasuredTypeEntity> {

    private static final long serialVersionUID = 326780199L;

    public static final QMeasuredTypeEntity measuredTypeEntity = new QMeasuredTypeEntity("measuredTypeEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QMeasuredTypeEntity(String variable) {
        super(MeasuredTypeEntity.class, forVariable(variable));
    }

    public QMeasuredTypeEntity(Path<? extends MeasuredTypeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMeasuredTypeEntity(PathMetadata metadata) {
        super(MeasuredTypeEntity.class, metadata);
    }

}

