package home.work2.hm3;

import java.util.Arrays;

public class SortUtils {

    // Bubble sort
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    // Selection sort
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfMinValue = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[indexOfMinValue]) {
                    indexOfMinValue = j;
                }
            }
            swap(array, indexOfMinValue, i);
        }
        return array;
    }

    // recursively separates arrays and then with the help of the merge method combines them into one sorted
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int midIndex = array.length / 2;
        int[] arrayLeft = Arrays.copyOfRange(array, 0, midIndex);
        int[] arrayRight = Arrays.copyOfRange(array, midIndex, array.length);
        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));

    }

    // merge two arrays
    public static int[] merge(int[] arrayLeft, int[] arrayRight) {
        int arraysLength = arrayLeft.length + arrayRight.length;
        int[] array = new int[arraysLength];
        int indexLeftArray = 0;
        int indexRightArray = 0;

        for (int i = 0; i < arraysLength; i++) {
            if (indexLeftArray == arrayLeft.length) {
                array[i] = arrayRight[indexRightArray++];
            } else if (indexRightArray == arrayRight.length) {
                array[i] = arrayLeft[indexLeftArray++];
            } else {
                array[i] = arrayLeft[indexLeftArray] < arrayRight[indexRightArray]
                        ? arrayLeft[indexLeftArray++] : arrayRight[indexRightArray++];
            }
        }
        return array;
    }

    // fill array random values
    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    // swaps array elements
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temporary = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temporary;
    }
}