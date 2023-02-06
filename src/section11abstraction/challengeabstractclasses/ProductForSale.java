package section11abstraction.challengeabstractclasses;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("Quantity %2d pcs. at %8.2f Dollar each, %-15s %-35s %n",
                quantity, price, type, description);
    }

    public abstract void showDetails();

}
