package billing;

public class Billing {

    public int generateBill(Customer customer) {
        int numOfAds = customer.getNumberOfAds();
        int numOfProducts = customer.getProducts().size();

        int adTotal = numOfAds * 50;
        int productTotal = numOfProducts * (numOfAds * 10);

        return adTotal + productTotal;
    }
}
