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
 * ActionChallenges model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "action_challenges")
public class ActionChallengesEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6376552850628361291L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	 
	@Column(name = "action_id")
	private Integer actionId;
	
	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "value")
	private Float value;
	
	@Column(name = "measured_type_id")
	private Integer measuredTypeId;
	
	@Column(name = "range_symbol")
	private String rangeSymbol;
	
	@Column(name = "range_value_1")
	private Float rangeValue1;
	
	@Column(name = "measured_type_range_1_id")
	private Integer measuredTypeRange1Id;
	 
	@Column(name = "range_value_2")
	private Float rangeValue2;
	 
	@Column(name = "measured_type_range_2_id")
	private Integer measuredTypeRange2Id;
	
	@Column(name = "route_id")
	private Integer routeId;
	
	@Column(name = "status")
	private short status;	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ActionsEntity actionsEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", referencedColumnName = "id", insertable = false, updatable = false)
	private RouteEntity routeEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "measured_type_id", referencedColumnName = "id", insertable = false, updatable = false)
	private MeasuredTypeEntity measuredTypeEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "measured_type_range_1_id", referencedColumnName = "id", insertable = false, updatable = false)
	private MeasuredTypeEntity measuredTypeEntity1;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "measured_type_range_2_id", referencedColumnName = "id", insertable = false, updatable = false)
	private MeasuredTypeEntity measuredTypeEntity2;
}
