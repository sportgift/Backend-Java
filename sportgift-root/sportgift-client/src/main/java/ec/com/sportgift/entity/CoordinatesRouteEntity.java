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
 * CoordinatesRoute model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "coordinates_route")
public class CoordinatesRouteEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -927308974246021869L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
	private Integer id;
	
	@Column(name = "route_id") 
	private Integer routeId;
	
	@Column(name = "latitude") 
	private Double latitude;
	
	@Column(name = "length") 
	private Double length;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", referencedColumnName = "id", insertable = false, updatable = false)
	private RouteEntity routeEntity;
	
}
