package Section08OopPolymorphism.exercise41billsburger;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Dinkel");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.printf("Add %s for an extra %.2f",
                this.healthyExtra1Name, this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.printf("Add %s for an extra %.2f",
                this.healthyExtra2Name, this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {

        double total = super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;

        if (healthyExtra1Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.healthyExtra1Name, this.healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.healthyExtra2Name, this.healthyExtra2Price);
        }

        return total;

    }

}
