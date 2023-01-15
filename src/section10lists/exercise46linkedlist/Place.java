package section10lists.exercise46linkedlist;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }

}

// public class Place {

// private String name;
// private int distance;

// public Place(String name, int distance) {
// this.name = name;
// this.distance = distance;
// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public int getDistance() {
// return distance;
// }

// public void setDistance(int distance) {
// this.distance = distance;
// }

// }
