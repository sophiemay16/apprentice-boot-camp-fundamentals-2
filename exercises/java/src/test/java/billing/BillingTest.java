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

    @Test
    public void billPrivateSellerWithNoProducts() {
        // given
        Billing billing = new Billing();

        PrivateSeller privateSeller = new PrivateSeller();
        privateSeller.setNumberOfAds(3);
        privateSeller.setProducts(List.of());

        // when
        int actualTotal = billing.generateBill(privateSeller);

        // then
        int expectedTotal = 60;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }

    @Test
    public void billPrivateSellerWithSingleProduct() {
        // given
        Billing billing = new Billing();

        PrivateSeller privateSeller = new PrivateSeller();
        privateSeller.setNumberOfAds(1);
        privateSeller.setProducts(List.of("100 images"));

        // when
        int actualTotal = billing.generateBill(privateSeller);

        // then
        int expectedTotal = 30;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }
}
