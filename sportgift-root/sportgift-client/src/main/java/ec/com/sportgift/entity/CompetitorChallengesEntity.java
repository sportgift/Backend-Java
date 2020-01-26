package ec.com.sportgift.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * CompetitorChallenges model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","challengeId","competitorId"})
@ToString
@Getter
@Setter
public class CompetitorChallengesEntity {
    @Id
    private Integer id;
    
    private Integer challengeId;
    
    private Integer competitorId;
    
    private Date participationDate;
    
    private String finalStatus;
    

}
