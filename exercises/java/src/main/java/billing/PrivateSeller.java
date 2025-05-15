package billing;

import java.util.List;

public class PrivateSeller implements Customer {
    private int numberOfAds;
    private List<String> products;

    public void setNumberOfAds(int numberOfAds) {
        this.numberOfAds = numberOfAds;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public int bill() {
        return 0;
    }
}
