package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSportsEntity is a Querydsl query type for SportsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSportsEntity extends EntityPathBase<SportsEntity> {

    private static final long serialVersionUID = -2119064250L;

    public static final QSportsEntity sportsEntity = new QSportsEntity("sportsEntity");

    public final StringPath icon = createString("icon");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QSportsEntity(String variable) {
        super(SportsEntity.class, forVariable(variable));
    }

    public QSportsEntity(Path<? extends SportsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSportsEntity(PathMetadata metadata) {
        super(SportsEntity.class, metadata);
    }

}

