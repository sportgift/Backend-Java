package ec.com.sportgift.entity;

import java.io.Serializable;

import javax.persistence.Column;
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
 * UserAccountEntity model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "user_account")
public class UserAccountEntity implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2665411285821337723L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "user_name")	
	private String userName;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "type_user")	
	private Integer typeUser;
	
	@Column(name = "role")	
	private String role;
	
	@Column(name = "password")	
	private String password;
}
