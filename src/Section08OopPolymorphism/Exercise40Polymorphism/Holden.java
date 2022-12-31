package Section08OopPolymorphism.Exercise40Polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Holden is accelerating.";
    }

    @Override
    public String brake() {
        return "Holden is braking.";
    }

    @Override
    public String startEngine() {
        return "Holden starts engine.";
    }

}
