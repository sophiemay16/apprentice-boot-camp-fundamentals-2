package billing;

public class Billing {

    public int generateBill(Dealer dealer) {
        int numOfAds = dealer.getNumberOfAds();
        int numOfProducts = dealer.getProducts().size();

        int adTotal = numOfAds * 50;
        int productTotal = numOfProducts * (numOfAds * 10);

        return adTotal + productTotal;
    }
}
