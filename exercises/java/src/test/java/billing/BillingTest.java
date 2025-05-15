package billing;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BillingTest {

    @Test
    public void billDealerWithSingleProduct() {
        // given
        Billing billing = new Billing();

        Dealer dealer = new Dealer.Builder()
                .withNumberOfAds(20)
                .withProducts(List.of("Advert promotion"))
                .build();

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

        Dealer dealer = new Dealer.Builder()
                .withNumberOfAds(1000)
                .withProducts(List.of("Finance", "Valuations"))
                .build();

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

        PrivateSeller privateSeller = new PrivateSeller.Builder()
                .withNumberOfAds(3)
                .withProducts(List.of())
                .build();

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

        PrivateSeller privateSeller = new PrivateSeller.Builder()
                .withNumberOfAds(1)
                .withProducts(List.of("100 images"))
                .build();

        // when
        int actualTotal = billing.generateBill(privateSeller);

        // then
        int expectedTotal = 30;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }

    @Test
    public void billPrivateSellerWithMultipleProducts() {
        // given
        Billing billing = new Billing();

        PrivateSeller privateSeller = new PrivateSeller.Builder()
                .withNumberOfAds(10)
                .withProducts(List.of("100 images", "Advert promotion"))
                .build();

        // when
        int actualTotal = billing.generateBill(privateSeller);

        // then
        int expectedTotal = 400;
        assertThat(actualTotal).isEqualTo(expectedTotal);
    }
}
