package billing;

import java.util.List;

public class Dealer {

    private int numberOfAds;
    private List<String> products;

    public void setNumberOfAds(int numberOfAds) {
        this.numberOfAds = numberOfAds;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public int getNumberOfAds() {
        return numberOfAds;
    }

    public List<String> getProducts() {
        return products;
    }
}
