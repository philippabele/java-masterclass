package section10lists.exercise45arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {

            printOptions();

            int option = input.nextInt();
            input.nextLine();

            if (option == 0) {
                break;
            } else if (option == 1) {
                addItems(groceryList);
            } else if (option == 2) {
                removeItems(groceryList);
            }

            Collections.sort(groceryList);
            System.out.println("Grocery List: " + groceryList);
        }
    }

    private static void printOptions() {

        String textBlock = """
                Available options:
                0 - quit
                1 - add item(s) with comma delimited list to the grocery list
                2 - remove item(s) with comma delimited list from the grocery list
                Enter your answer:
                """;

        System.out.print(textBlock);

    }

    private static void addItems(ArrayList<String> groceryList) {

        System.out.println("Enter a comma-delimited list of items to add:");
        String items = input.nextLine();
        String[] itemsToAdd = items.split(",");

        for (String item : itemsToAdd) {
            item = item.trim();
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            }
        }

    }

    private static void removeItems(ArrayList<String> groceryList) {

        System.out.println("Enter a comma-delimited list of items to remove:");
        String items = input.nextLine();
        String[] itemsToRemove = items.split(",");

        for (String item : itemsToRemove) {
            item = item.trim();
            if (groceryList.contains(item)) {
                groceryList.remove(item);
            }
        }

    }
}
