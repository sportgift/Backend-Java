package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPhotosEntity is a Querydsl query type for PhotosEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPhotosEntity extends EntityPathBase<PhotosEntity> {

    private static final long serialVersionUID = -459662136L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhotosEntity photosEntity = new QPhotosEntity("photosEntity");

    public final QChallengeEntity challengeEntity;

    public final NumberPath<Integer> challengeId = createNumber("challengeId", Integer.class);

    public final QCompetitorEntity competitorEntity;

    public final NumberPath<Integer> competitorId = createNumber("competitorId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QPhotosEntity(String variable) {
        this(PhotosEntity.class, forVariable(variable), INITS);
    }

    public QPhotosEntity(Path<? extends PhotosEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPhotosEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPhotosEntity(PathMetadata metadata, PathInits inits) {
        this(PhotosEntity.class, metadata, inits);
    }

    public QPhotosEntity(Class<? extends PhotosEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.challengeEntity = inits.isInitialized("challengeEntity") ? new QChallengeEntity(forProperty("challengeEntity"), inits.get("challengeEntity")) : null;
        this.competitorEntity = inits.isInitialized("competitorEntity") ? new QCompetitorEntity(forProperty("competitorEntity"), inits.get("competitorEntity")) : null;
    }

}

