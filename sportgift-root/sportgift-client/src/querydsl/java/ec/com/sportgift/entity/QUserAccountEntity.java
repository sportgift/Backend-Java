package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserAccountEntity is a Querydsl query type for UserAccountEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserAccountEntity extends EntityPathBase<UserAccountEntity> {

    private static final long serialVersionUID = 1619813345L;

    public static final QUserAccountEntity userAccountEntity = new QUserAccountEntity("userAccountEntity");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath password = createString("password");

    public final StringPath role = createString("role");

    public final NumberPath<Integer> typeUser = createNumber("typeUser", Integer.class);

    public final StringPath userName = createString("userName");

    public QUserAccountEntity(String variable) {
        super(UserAccountEntity.class, forVariable(variable));
    }

    public QUserAccountEntity(Path<? extends UserAccountEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserAccountEntity(PathMetadata metadata) {
        super(UserAccountEntity.class, metadata);
    }

}

