package Section08OopPolymorphism.exercise41billsburger;

public class Hamburger {

    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat,
            double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.printf("Add %s for an extra %.2f", name, price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.printf("Add %s for an extra %.2f", name, price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.printf("Add %s for an extra %.2f", name, price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.printf("Add %s for an extra %.2f", name, price);
    }

    public double itemizeHamburger() {

        double total = this.price + this.addition1Price +
                this.addition2Price + this.addition3Price +
                this.addition4Price;

        System.out.printf("%s hamburger on %s with %s for %.2f%n",
                this.name, this.breadRollType,
                this.meat, this.price);

        if (addition1Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.addition1Name, this.addition1Price);
        }
        if (addition2Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.addition2Name, this.addition2Price);
        }
        if (addition3Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.addition3Name, this.addition3Price);
        }
        if (addition4Name != null) {
            System.out.printf("Add %s for an extra %.2f%n",
                    this.addition4Name, this.addition4Price);
        }
        return total;
    }
}
