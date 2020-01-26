package ec.com.sportgift.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
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
@ToString
@Getter
@Setter
@Table(name = "competitor_challenges")
public class CompetitorChallengesEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7959604131262063566L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
	@Column(name = "challenge_id")
    private Integer challengeId;
    
	@Column(name = "competitor_id")
    private Integer competitorId;
    
	@Column(name = "participation_date")
    private Date participationDate;
    
	@Column(name = "final_status")
    private String finalStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competitor_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CompetitorEntity competitorEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "challenge_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ChallengeEntity challengeEntity;
    

}
