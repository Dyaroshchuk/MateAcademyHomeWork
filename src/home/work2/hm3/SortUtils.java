package home.work2.hm3;

import java.util.Arrays;

public class SortUtils {

    public static void main(String[] args) {
        int[] arrayForBubble = fillArray(10);
        int[] arrayForSelection = fillArray(10);
        int[] arrayForMerge = fillArray(10);

        // check Bubble sort
        System.out.println("bubble " + Arrays.toString(arrayForBubble));
        bubbleSort(arrayForBubble);
        System.out.println("bubble " + Arrays.toString(arrayForBubble));

        // check Selection sort
        System.out.println("Selection " + Arrays.toString(arrayForSelection));
        selectionSort(arrayForSelection);
        System.out.println("Selection " + Arrays.toString(arrayForSelection));

        // check Bubble sort
        System.out.println("Merge " + Arrays.toString(arrayForMerge));
        int[] arrayForMergeorted = mergeSort(arrayForMerge);
        System.out.println("Merge " + Arrays.toString(arrayForMergeorted));

    }

    private static int[] bubbleSort(int[] array) {
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

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minInd = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            swap(array, minInd, i);
        }
        return array;
    }

    private static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int midIndex = array.length / 2;
        int[] arrayOne = Arrays.copyOfRange(array, 0, midIndex);
        int[] arrayTwo = Arrays.copyOfRange(array, midIndex, array.length);
        return merge(mergeSort(arrayOne), mergeSort(arrayTwo));

    }

    // merge two arrays
    private static int[] merge(int[] arrayOne, int[] arrayTwo) {
        int arraysLength = arrayOne.length + arrayTwo.length;
        int[] array = new int[arraysLength];
        int indOne = 0;
        int indTwo = 0;

        for (int i = 0; i < arraysLength; i++) {
            if (indOne == arrayOne.length) {
                array[i] = arrayTwo[indTwo++];
            } else if (indTwo == arrayTwo.length) {
                array[i] = arrayOne[indOne++];
            } else {
                if (arrayOne[indOne] < arrayTwo[indTwo]) {
                    array[i] = arrayOne[indOne++];
                } else {
                    array[i] = arrayTwo[indTwo++];
                }
            }
        }
        return array;
    }

    private static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public static void swap(int[] array, int indOne, int indTwo) {
        int tmp = array[indOne];
        array[indOne] = array[indTwo];
        array[indTwo] = tmp;
    }


}
