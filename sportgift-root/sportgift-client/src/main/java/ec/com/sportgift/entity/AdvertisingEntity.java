package ec.com.sportgift.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * Advertising model.
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
@Table(name = "advertising")
public class AdvertisingEntity implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -157881594803026187L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "sponsoring_company_id")
	private Integer sponsoringCompanyId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	@Column(name = "expiration_date")
	private Date expirationDate;
	
	@Column(name = "rate")
	private Integer rate;
	
	@Column(name = "status")
	private short status;	 

}
