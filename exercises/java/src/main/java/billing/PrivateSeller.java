package billing;

import java.util.List;

public class PrivateSeller implements Customer {

    private final int numberOfAds;
    private final List<String> products;

    public PrivateSeller(int numberOfAdds, List<String> products) {
        this.numberOfAds = numberOfAdds;
        this.products = products;
    }

    public static PrivateSeller.Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private int numberOfAdds;
        private List<String> products;

        public PrivateSeller.Builder withNumberOfAds(int numOfAds) {
            this.numberOfAdds = numOfAds;
            return this;
        }

        public PrivateSeller.Builder withProducts(List<String> products) {
            this.products = products;
            return this;
        }

        public PrivateSeller build() {
            return new PrivateSeller(numberOfAdds, products);
        }
    }

    @Override
    public int bill() {
        int adTotal = numberOfAds * 20;
        int productTotal = products.size() * (numberOfAds * 10);
        return adTotal + productTotal;
    }
}
