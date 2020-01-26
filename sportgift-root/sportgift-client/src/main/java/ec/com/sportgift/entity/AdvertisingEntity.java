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
 * Advertising model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"description"})
@ToString
@Getter
@Setter
public class AdvertisingEntity {
	 @Id
	 private Integer id;
	 
	 private Integer sponsoringCompanyId;
	 
	 private String description;
	 
	 private Date creationDate;
	 
	 private Date expirationDate;
	 
	 private Integer rate;
	 
	 private short status;	 

}
