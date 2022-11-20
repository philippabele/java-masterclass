package Section03FirstSteps;

public class PrimitiveTypes {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value is " + myMinIntValue);
        System.out.println("Integer Maximum Value is " + myMaxIntValue);

        System.out.println("Overflow example " + (myMaxIntValue + 1));
        System.out.println("Underflow example " + (myMinIntValue - 1));

    }
}
