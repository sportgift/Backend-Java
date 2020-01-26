package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * ActionChallenges model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","actionId"})
@ToString
@Getter
@Setter
public class ActionChallengesEntity {
	
	 @Id
	 private Integer id;
	 
	 private Integer actionId;
	 
	 private String symbol;
	 
	 private Float value;
	 
	 private Integer measuredTypeId;
	 
	 private String rangeSymbol;
	 
	 private Float rangeValue1;
	 
	 private Integer measuredTypeRange1Id;
	 
	 private Float rangeValue2;
	 
	 private Integer measuredTypeRange2Id;
	 
	 private Integer routeId;
	 
	 private short status;	
}
