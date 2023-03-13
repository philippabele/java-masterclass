package section14collections.exercise42adventuregame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Map<Integer, Location> locations = new HashMap<Integer, Location>();
        final Map<String, String> vocabulary = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        Scanner scanner = new Scanner(System.in);

        vocabulary.put("NORTH", "N");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");

        int currentLocation = 1;

        while (true) {
            try {

                System.out.println("");
                System.out.println(locations.get(currentLocation).getDescription());
                System.out.println("");
                System.out.println(
                        "Available exists are " + locations.get(currentLocation).getExits().keySet().toString());
                System.out.println("Please enter a dicretion to go on");
                System.out.println("");

                String userInput = scanner.nextLine();
                userInput = userInput.toUpperCase();

                if (userInput.equalsIgnoreCase("Q")) {
                    break;
                }

                if (userInput.length() == 0) {
                    System.out.println("Please enter at least one Character");
                    continue;

                } else if (userInput.length() > 1) {
                    String[] words = userInput.split(" ");
                    for (String word : words) {
                        if (vocabulary.containsKey(word)) {
                            userInput = vocabulary.get(word);
                        }
                    }
                }

                if (locations.get(currentLocation).getExits().containsKey(userInput)) {
                    currentLocation = locations.get(currentLocation).getExits().get(userInput);
                }

            } catch (Exception e) {
                System.out.println("An error occured");
            }
        }

        scanner.close();

    }

}
