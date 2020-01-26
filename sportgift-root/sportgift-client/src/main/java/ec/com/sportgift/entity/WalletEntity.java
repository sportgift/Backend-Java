package ec.com.sportgift.entity;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Wallet model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@EqualsAndHashCode(of = {"competitorId","address"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class WalletEntity {

    @Id
    private Integer id;
    
    private String address;
    
    private Integer tokensWon;
    
    private Integer competitorId;
}
