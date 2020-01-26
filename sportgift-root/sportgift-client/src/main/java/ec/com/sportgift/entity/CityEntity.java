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

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * City model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@ToString
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "city")
public class CityEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2956619523602228053L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private Integer id;
    
	@Column(name = "country_id")
    private final Integer countryId;
    
	@Column(name = "name")
    private final String name;
    
	@Column(name = "status")
    private short status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CountryEntity countryEntity;
}
