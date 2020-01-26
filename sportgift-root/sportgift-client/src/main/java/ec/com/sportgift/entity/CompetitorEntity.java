package ec.com.sportgift.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Competitor model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"cityId", "name"})
@ToString
@Getter
@Setter
public class CompetitorEntity {

    @Id
    private Integer id;

    private String name;

    private String username;

    private String password;

    private String avatar;

    private Float weight;

    private Float height;

    private Character gender;

    private LocalDate dateBirth;

    private Integer cityId;

    private String address;

    private String facebook;

    private String instagram;

    private String twitter;

    private LocalDateTime registration;

    private Short status;

   
}
