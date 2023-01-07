package section09arrays.exercise42arraychallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {

        int[] myArray = getRandomArray(5);
        System.out.println(Arrays.toString(myArray));
        int[] mySortedArray = sortMyArray(myArray);
        System.out.println(Arrays.toString(mySortedArray));

    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] myRandomArray = new int[len];

        for (int i = 0; i < myRandomArray.length; i++) {
            myRandomArray[i] = random.nextInt(100);
        }

        return myRandomArray;

    }

    public static int[] sortMyArray(int[] myRandomArray) {

        Arrays.sort(myRandomArray);

        int[] myReversedArray = new int[myRandomArray.length];

        for (int i = 0; i < myReversedArray.length; i++) {
            myReversedArray[i] = myRandomArray[myRandomArray.length - 1 - i];
        }

        return myReversedArray;

    }

}
