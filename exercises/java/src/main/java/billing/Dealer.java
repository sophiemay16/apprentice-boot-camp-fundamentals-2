package billing;

import java.util.List;

public class Dealer implements Customer {

    private final int numberOfAds;
    private final List<String> products;

    public Dealer(int numberOfAdds, List<String> products) {
        this.numberOfAds = numberOfAdds;
        this.products = products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int numberOfAdds;
        private List<String> products;

        public Builder withNumberOfAds(int numOfAds) {
            this.numberOfAdds = numOfAds;
            return this;
        }

        public Builder withProducts(List<String> products) {
            this.products = products;
            return this;
        }

        public Dealer build() {
            return new Dealer(numberOfAdds, products);
        }
    }

    @Override
    public int bill() {
        int adTotal = numberOfAds * 50;
        int productTotal = products.size() * (numberOfAds * 10);
        return adTotal + productTotal;
    }
}
