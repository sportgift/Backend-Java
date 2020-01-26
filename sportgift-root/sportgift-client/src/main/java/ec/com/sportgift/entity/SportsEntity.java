package ec.com.sportgift.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sports model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@ToString
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sports")
public class SportsEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8369036260974479640L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
	@Column(name = "name")
    private final String name;
    
	@Column(name = "icon")
    private final String icon;
    
	@Column(name = "status")
    private short status;
}
