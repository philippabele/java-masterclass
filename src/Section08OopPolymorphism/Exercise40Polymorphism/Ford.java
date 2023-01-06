package Section08OopPolymorphism.Exercise40Polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Ford is accelerating.";
    }

    @Override
    public String brake() {
        return "Ford is braking.";
    }

    @Override
    public String startEngine() {
        return "Ford starts engine.";
    }

}
