package ec.com.sportgift.entity;


import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * City model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@EqualsAndHashCode(of = {"countryId", "name"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class CityEntity {

    @Id
    private Integer id;
    
    private final Integer countryId;
    
    private final String name;
    
    private short status;
}
