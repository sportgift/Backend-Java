package ec.com.sportgift.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Country model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@ToString
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "country")
public class CountryEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3042027547590792227L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private Integer id;
    
	@Column(name = "name") 
    private final String name;
    
	@Column(name = "status") 
    private short status;
}
