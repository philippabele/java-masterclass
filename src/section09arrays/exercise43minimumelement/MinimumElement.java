package section09arrays.exercise43minimumelement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        System.out.println("Starting Software");
        int[] userInput = readIntegers();
        System.out.println("min = " + findMin(userInput));

    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // System.out.println("Enter a Number");
            try {
                String userInputString = scanner.nextLine();
                String[] mySplits = userInputString.split(",");
                int[] myNumbers = new int[mySplits.length];

                for (int i = 0; i < mySplits.length; i++) {
                    myNumbers[i] = Integer.parseInt(mySplits[i].trim());
                }

                return myNumbers;

            } catch (NumberFormatException badUserData) {
                scanner.close();
                int[] myNumbers = new int[] { -1 };
                return myNumbers;
            }
        }

    }

    private static int findMin(int[] userArray) {

        int[] sortedArray = userArray.clone();
        Arrays.sort(sortedArray);

        return sortedArray[0];

    }

}
