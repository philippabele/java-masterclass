package section11abstraction.challengeabstractclasses;

public class ProductKeyboard extends ProductForSale {

    public ProductKeyboard(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Illuminated keys with selectable key colors.");

    }

}
