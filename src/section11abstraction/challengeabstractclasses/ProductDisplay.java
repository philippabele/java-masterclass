package section11abstraction.challengeabstractclasses;

public class ProductDisplay extends ProductForSale {

    public ProductDisplay(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Best Resolution with 5K x 2K.");
    }

}
