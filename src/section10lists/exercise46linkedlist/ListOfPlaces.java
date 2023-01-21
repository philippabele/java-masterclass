package section10lists.exercise46linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListOfPlaces {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Sydney", 0));

        ListIterator<Place> iterator = placesToVisit.listIterator();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean quitLoop = false;
            boolean forward = true;

            printMenue();

            while (!quitLoop) {

                if (!iterator.hasPrevious()) {
                    System.out.println("Starting from " + iterator.next());
                    forward = true;
                }

                if (!iterator.hasNext()) {
                    System.out.println("Ending at " + iterator.previous());
                    forward = false;
                }

                System.out.println("Enter Value: ");
                String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

                switch (menuItem) {
                    case "F":
                        if (!forward) {
                            if (iterator.hasNext()) {
                                forward = true;
                                iterator.next();
                            }
                        }
                        System.out.println("User wants to go forward.");
                        if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                        break;
                    case "B":
                        if (forward) {
                            if (iterator.hasPrevious()) {
                                forward = false;
                                iterator.previous();
                            }
                        }
                        System.out.println("User wants to go backward.");
                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                        break;
                    case "M":
                        printMenue();
                        break;
                    case "L":
                        System.out.println(placesToVisit.toString());
                        break;
                    default:
                        quitLoop = true;
                        break;
                }
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (!list.contains(place)) {

            int index = 0;
            for (Place existingPlace : list) {

                if (place.distance() < existingPlace.distance()) {
                    list.add(index, place);
                    System.out.println("Add " + place.toString());
                    return;

                }
                index++;

            }

            list.addLast(place);
            return;

        } else {
            System.out.println("Found duplicate " + place.toString());
        }

    }

    public static void listItinerary(LinkedList<Place> placesToVisit) {

        for (Place place : placesToVisit) {
            System.out.printf("Place : %s with Distance %d.",
                    place.name(), place.distance());
            System.out.println();
        }

    }

    public static void printMenue() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);

    }

    public static void quit() {
        System.out.println("Good bye. Program closed.");
    }

}
