package ec.com.sportgift.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * PromotionsAwards model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name", "description"})
@ToString
@Getter
@Setter
@Entity
@Table(name = "promotions_awards")
public class PromotionsAwardsEntity implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 3159743416148616959L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	 
	@Column(name = "name")
	private String name;
	 
	@Column(name = "description")
	private String description;
	 
	@Column(name = "prize_type")
	private char prizeType;
	 
	@Column(name = "photo")
	private String photo;
	 
	@Column(name = "maximum_exchange_date")
	private Date maximumExchangeDate;
	 
	@Column(name = "sponsoring_company_id")
	private Integer sponsoringCompanyId;
	 
	@Column(name = "status")
	private short status;
}
