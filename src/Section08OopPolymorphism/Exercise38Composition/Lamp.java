package Section08OopPolymorphism.Exercise38Composition;

public class Lamp {

    /*
     * 1) Create a class and name it Lamp. Inside this class should be declared
     * three member variables: style of type String, battery of type boolean, and
     * globRating of type int. All variables should be marked private. A constructor
     * needs to be created which accepts the three member variables as parameters.
     * In addition, four methods should also be created: turnOn() has no return type
     * and should print a message that the lamp is being turned on; getStyle()
     * returns the lamp style; isBattery returns the value of battery; and
     * getGlobRating() returns the globRating of the lamp.
     */

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is on");
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }

}
