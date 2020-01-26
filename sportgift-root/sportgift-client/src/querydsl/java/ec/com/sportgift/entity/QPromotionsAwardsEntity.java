package ec.com.sportgift.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPromotionsAwardsEntity is a Querydsl query type for PromotionsAwardsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPromotionsAwardsEntity extends EntityPathBase<PromotionsAwardsEntity> {

    private static final long serialVersionUID = -1055090291L;

    public static final QPromotionsAwardsEntity promotionsAwardsEntity = new QPromotionsAwardsEntity("promotionsAwardsEntity");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> maximumExchangeDate = createDateTime("maximumExchangeDate", java.util.Date.class);

    public final StringPath name = createString("name");

    public final StringPath photo = createString("photo");

    public final ComparablePath<Character> prizeType = createComparable("prizeType", Character.class);

    public final NumberPath<Integer> sponsoringCompanyId = createNumber("sponsoringCompanyId", Integer.class);

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public QPromotionsAwardsEntity(String variable) {
        super(PromotionsAwardsEntity.class, forVariable(variable));
    }

    public QPromotionsAwardsEntity(Path<? extends PromotionsAwardsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPromotionsAwardsEntity(PathMetadata metadata) {
        super(PromotionsAwardsEntity.class, metadata);
    }

}

