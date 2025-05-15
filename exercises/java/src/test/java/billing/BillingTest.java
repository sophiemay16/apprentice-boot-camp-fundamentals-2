package billing;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BillingTest {

    @Test
    public void billDealerWithSingleProduct() {
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

    @Test
    public void billDealerWithMultipleProducts() {
        // given
        Billing billing = new Billing();

        Dealer dealer = new Dealer();
        dealer.setNumberOfAds(1000);
        dealer.setProducts(List.of("Finance", "Valuations"));

        // when
        int actualTotal = billing.generateBill(dealer);

        // then
        int expectedTotal = 70000;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }
}
