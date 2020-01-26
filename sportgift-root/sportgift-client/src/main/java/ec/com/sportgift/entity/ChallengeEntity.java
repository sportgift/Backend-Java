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
 * Challenge model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString
@Getter
@Setter
public class ChallengeEntity {
	
	 @Id
	 private Integer id;
	 
	 private String name;
	 
	 private Date startDate;
	 
	 private Date endDate;
	 
	 private Integer maximumParticipants;/* check  */
	 
	 private Integer sportId;
	 
	 private Integer sponsoringCompanyId;
	 
	 private short status; /* check */ 
	 
	 
}
