package section11abstraction.challengeabstractclasses;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> productList = new ArrayList<>();

    public static void main(String[] args) {

        productList.add(new ProductDesk("Wood Desk", 1000, "Incredible solid."));
        productList.add(new ProductDisplay("WUHD Display", 800, "Perfect for working."));
        productList.add(new ProductKeyboard("Wireless Keyboard", 100, "Backlit keys"));

        listProducts();

        var customerOrder = new ArrayList<OrderItem>();

        addItemToOrder(customerOrder, 0, 1);
        addItemToOrder(customerOrder, 1, 2);
        addItemToOrder(customerOrder, 2, 1);

        printOrder(customerOrder);
    }

    public static void listProducts() {

        for (var product : productList) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }

    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, productList.get(orderIndex)));
    }

    public void printDetails(ProductForSale pfs) {
        pfs.showDetails();
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        System.out.println("#".repeat(30));
        for (var item : order) {
            item.product().printPricedLineItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("#".repeat(30));
        System.out.printf("Total Price is %6.2f %n", salesTotal);

    }

}
