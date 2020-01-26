package ec.com.sportgift.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * CompetitorAwards model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "competitor_awards")
public class CompetitorAwardsEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6760573403407289618L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "promotions_awards_id")
	private Integer promotionsAwardsId;
	
	@Column(name = "competitor_id")	
	private Integer competitorId;
	
	@Column(name = "competitor_challenge_id")	
	private Integer competitorChallengeId;
	
	@Column(name = "status")	
	private short status;

}
