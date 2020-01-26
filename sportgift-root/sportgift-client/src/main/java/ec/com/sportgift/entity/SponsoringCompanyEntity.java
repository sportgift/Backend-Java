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
 * SponsoringCompany model.
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
@Table(name = "sponsoring_company")
public class SponsoringCompanyEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6896258416742747421L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
	@Column(name = "name")
    private String name;
	
	@Column(name = "user_account_id")
    private Integer userAccoundId;
    
	@Column(name = "rif_ruc") 
    private String rifRuc;
    
	@Column(name = "logo")
    private String logo;
    
	@Column(name = "headquarters_address")
    private String headquartersAddress;
    
	@Column(name = "phone")
    private String phone;
    
	@Column(name = "length_location")
    private Double lengthLocation;
    
	@Column(name = "latitude_location")
    private Double latitudeLocation;
    
	@Column(name = "emails")
    private String emails;
    
	@Column(name = "web")
    private String web;
    
	@Column(name = "facebook")
    private String facebook;
    
	@Column(name = "instagram")
    private String instagram;
    
	@Column(name = "twitter")
    private String twitter;
    
	@Column(name = "registration_date")
    private Date registrationDate;    
    
	@Column(name = "status")
    private short status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id", referencedColumnName = "id", insertable = false, updatable = false)
	private UserAccountEntity userAccountEntity;

}
