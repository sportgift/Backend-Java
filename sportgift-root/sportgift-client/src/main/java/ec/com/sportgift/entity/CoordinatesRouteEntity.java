package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * CoordinatesRoute model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","latitude","length"})
@ToString
@Getter
@Setter
public class CoordinatesRouteEntity {

	@Id
	private Integer id;
	
	private Integer routeId;
	
	private Double latitude;
	
	private Double length;
	
}
