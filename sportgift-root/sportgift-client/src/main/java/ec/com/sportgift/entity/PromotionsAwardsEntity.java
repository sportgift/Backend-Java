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
 * PromotionsAwards model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name", "description"})
@ToString
@Getter
@Setter
public class PromotionsAwardsEntity {

	 @Id
	 private Integer id;
	 
	 private String name;
	 
	 private String description;
	 
	 private char prizeType;
	 
	 private String photo;
	 
	 private Date maximumExchangeDate;
	 
	 private Integer sponsoringCompanyId;
	 
	 private short status;
}
