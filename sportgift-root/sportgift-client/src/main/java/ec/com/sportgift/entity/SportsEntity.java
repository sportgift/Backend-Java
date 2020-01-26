package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(of = {"name"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class SportsEntity {
    @Id
    private Integer id;
    
    private final String name;
    
    private final String icon;
    
    private short status;
}
