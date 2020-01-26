package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(of = {"name"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class CountryEntity {
    @Id
    private Integer id;
    
    private final String name;
    
    private short status;
}
