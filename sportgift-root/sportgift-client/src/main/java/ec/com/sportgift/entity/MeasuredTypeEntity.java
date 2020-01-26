package ec.com.sportgift.entity;

import java.io.Serializable;

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
 * MeasuredType model.
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
@Table(name = "measured_type")
public class MeasuredTypeEntity implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8508422988105868376L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
	@Column(name = "name")
    private String name;
    
	@Column(name = "status")
    private short status;

}
