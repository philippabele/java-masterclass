package section11abstraction.challengeabstractclasses;

public class ProductDesk extends ProductForSale {

    public ProductDesk(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Red Dot Design Award winner of 2023.");
    }

}
