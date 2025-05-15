package billing;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BillingTest {

    @Test
    public void billDealer() {
        // given
        Billing billing = new Billing();

        Dealer dealer = new Dealer();
        dealer.setNumberOfAds(20);
        dealer.setProducts(List.of("Advert promotion"));

        // when
        int actualTotal = billing.generateBill(dealer);

        // then
        int expectedTotal = 1200;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }
}
