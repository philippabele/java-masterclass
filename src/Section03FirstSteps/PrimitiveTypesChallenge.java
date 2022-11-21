package Section03FirstSteps;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {

        byte anotherByte = 123;
        short anotherShort = 4567;
        int anotherInteger = 23456;

        long calculatedLong = 50_000 + 10 *
                (anotherByte + anotherShort + anotherInteger);

        System.out.println("The result of calculation is " + calculatedLong);

    }
}
