package ec.com.sportgift.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * Photos model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "photos")
public class PhotosEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3766179010476468310L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "challenge_id")
	private Integer challengeId;
	
	@Column(name = "competitor_id")
	private Integer competitorId;
	
	@Column(name = "status")	
	private short status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "challenge_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ChallengeEntity challengeEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competitor_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CompetitorEntity competitorEntity;
}
