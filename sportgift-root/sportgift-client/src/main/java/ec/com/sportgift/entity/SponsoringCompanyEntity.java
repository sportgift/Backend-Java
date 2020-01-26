package ec.com.sportgift.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * SponsoringCompany model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name","rifRuc"})
@ToString
@Getter
@Setter
public class SponsoringCompanyEntity {

    @Id
    private Integer id;
    
    private String name;
    
    private String rifRuc;
    
    private String logo;
    
    private String headquartersAddress;
    
    private String phone;
    
    private Double lengthLocation;
    
    private Double latitudeLocation;
    
    private String emails;
    
    private String web;
    
    private String facebook;
    
    private String instagram;
    
    private String twitter;
    
    private Date registrationDate;    
    
    private short status;
}
