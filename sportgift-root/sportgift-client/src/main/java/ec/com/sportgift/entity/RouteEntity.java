package ec.com.sportgift.entity;

import java.io.Serializable;

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
 * Route model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "route")
public class RouteEntity implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 9085204150790397493L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private Integer id;
    
	@Column(name = "name") 
    private String name;
    
	@Column(name = "country_id") 
    private Integer countryId;
    
	@Column(name = "city_id") 
    private Integer cityId;
    
	@Column(name = "status") 
    private short status;    
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CountryEntity countryEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CityEntity cityEntity;
 
}
