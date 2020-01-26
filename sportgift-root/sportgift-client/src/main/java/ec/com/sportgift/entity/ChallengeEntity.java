package ec.com.sportgift.entity;

import java.io.Serializable;
import java.util.Date;

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
 * Challenge model.
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
@Table(name = "challenge")
public class ChallengeEntity implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7635033971117828580L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	 
	@Column(name = "start_date")
	private Date startDate;
	 
	@Column(name = "end_date")
	private Date endDate;
	 
	@Column(name = "maximum_participants")
	private Integer maximumParticipants;
	
	@Column(name = "sport_id")
	private Integer sportId;
	
	@Column(name = "sponsoring_company_id")
	private Integer sponsoringCompanyId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id", referencedColumnName = "id", insertable = false, updatable = false)
	private SportsEntity sportsEntity;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sponsoring_company_id", referencedColumnName = "id", insertable = false, updatable = false)
	private SponsoringCompanyEntity sponsoringCompanyEntity;
}
