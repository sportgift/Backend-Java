package ec.com.sportgift.entity;

import java.io.Serializable;
import java.time.LocalDate;
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
 * Competitor model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "competitor")
public class CompetitorEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1900795569457460864L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

	@Column(name = "name")
    private String name;
	
	@Column(name = "user_account_id")
    private Integer userAccountId;
	
	@Column(name = "email")
    private String email;

	@Column(name = "avatar")
    private String avatar;
	
	@Column(name = "password")
	private String password;

	@Column(name = "name")
    private Float weight;

	@Column(name = "height")
    private Float height;
	
	@Column(name = "gender")
    private Character gender;

	@Column(name = "birth_date")
    private LocalDate birthDate;

	@Column(name = "city_id")
    private Integer cityId;
	
	@Column(name = "country_id")
    private Integer countryId;

	@Column(name = "address")
    private String address;

	@Column(name = "facebook")
    private String facebook;

	@Column(name = "instagram")
    private String instagram;

	@Column(name = "twitter")
    private String twitter;
	
	@Column(name = "snapchat")
    private String snapchat;

	@Column(name = "registration")
    private Date registration;

	@Column(name = "status")
    private Short status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CityEntity cityEntity;
		
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CountryEntity countryEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id", referencedColumnName = "id", insertable = false, updatable = false)
	private UserAccountEntity userAccountEntity;

   
}
