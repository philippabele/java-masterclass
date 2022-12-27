package Section07OopInheritance.Exercise37PoolArea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolumn() {
        return getArea() * height;
    }

}
