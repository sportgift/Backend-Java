package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(of = {"id","promotionsAwardsId","competitorId"})
@ToString
@Getter
@Setter
public class CompetitorAwardsEntity {
	
	@Id
	private Integer id;
	
	private Integer promotionsAwardsId;
	
	private Integer competitorId;
	
	private Integer competitorChallengeId;
	
	private short status;

}
