package Section03FirstSteps;

public class Operator {
    public static void main(String[] args) {

        int result = 1 + 2; // my Comment
        System.out.println(result);

        result = result - 1;
        result = result * 10;
        result = result / 5;
        result = result % 3;

        result++;
        result--;

        result += 2;
        result -= 1;
        result *= 10;
        result /= 2;

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of them :)");
        }

        int topScore = 50;
        int secondTopScore = 60;

        // Logical AND
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Both conditions fullfilled");
        }

        // Logical OR
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Al least one condition fullfilled");
        }

        // Good practice with boolean values
        boolean isCar = false;
        if (!isCar) {
            System.out.println("Go out and walk");
        }

        // The ternary operator
        boolean isSomething = true;
        int isSomehtingElse = isSomething ? 1 : 2;
        System.out.println("Value of isSomethingElse is " + isSomehtingElse);

    }
}
