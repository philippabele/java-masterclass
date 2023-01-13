package section09arrays.exercise44swappedarray;

import java.util.Arrays;

public class SwappedArray {

    public static void main(String[] args) {

        int[] demoArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(demoArray));
        swappArray(demoArray);
        System.out.println(Arrays.toString(demoArray));

    }

    private static void swappArray(int[] myArray) {

        for (int i = 0; i <= (myArray.length / 2) - 1; i++) {

            int swappCache = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = swappCache;

        }

    }

}
