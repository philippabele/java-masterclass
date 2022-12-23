package Section07OopInheritance.Exercise33Point;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {

        return Math.sqrt((point.getX() - this.x) * (point.getX() - this.x) +
                (point.getY() - this.y) * (point.getY() - this.y));
    }

    public double distance(int x, int y) {

        Point secondPoint = new Point();

        secondPoint.setX(x);
        secondPoint.setY(y);

        return this.distance(secondPoint);

    }

    public double distance() {

        return this.distance(0, 0);

    }

}
