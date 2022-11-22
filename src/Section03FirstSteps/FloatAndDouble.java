package Section03FirstSteps;

public class FloatAndDouble {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value is " + myMinFloatValue);
        System.out.println("Float max value is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value is " + myMinDoubleValue);
        System.out.println("Double max value is " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        System.out.println("My Int: " + myIntValue);
        System.out.println("My float: " + myFloatValue);
        System.out.println("My Double: " + myDoubleValue);

        int myIntValue2 = 5 / 3;
        float myFloatValue2 = 5f / 3f;
        double myDoubleValue2 = 5d / 3d;
        double myDoubleValue3 = 5.00 / 3.00;

        System.out.println("My Int calc: " + myIntValue2);
        System.out.println("My float calc: " + myFloatValue2);
        System.out.println("My Double calc: " + myDoubleValue2);
        System.out.println("My Double calc2: " + myDoubleValue3);

        double myPound = 200_000.123_456d;
        double myKilogram = myPound * 0.453_592_37d;
        System.out.println(myPound + " pounds equals " + myKilogram + " kilograms");

    }
}
