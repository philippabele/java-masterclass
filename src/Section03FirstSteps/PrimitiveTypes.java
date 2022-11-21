package Section03FirstSteps;

public class PrimitiveTypes {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value is " + myMinIntValue);
        System.out.println("Integer Maximum Value is " + myMaxIntValue);

        System.out.println("Overflow example " + (myMaxIntValue + 1));
        System.out.println("Underflow example " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("Use _ to make reading big numbers easy " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value: " + myMinByteValue);
        System.out.println("Maximum Byte Value:" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value: " + myMinShortValue);
        System.out.println("Maximum Short Value:" + myMaxShortValue);

        long myLongValue = 100;
        System.out.println("Integer Value" + myLongValue + "fits into long Type");

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value: " + myMinLongValue);
        System.out.println("Maximum Long Value:" + myMaxLongValue);

        long myVeryLongValue = 2_147_483_647_123L;
        System.out.println("Keep in Mind to write L after long values like " + myVeryLongValue);

    }
}
