package home.work1.hm05;

import java.util.Arrays;

/**
 * 1.5 Попрактиковаться, реализовав 5 сортировок на выбор.
 * И каждую из выбраных сортировок испытать на массиве величиной
 * в 1000000 и подсчитать время выполнения.
 */

public class ArraySorts {
    // massif numbers swap method
    public static void swap(int[] array, int indOne, int indTwo) {
        int tmp = array[indOne];
        array[indOne] = array[indTwo];
        array[indTwo] = tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        int[] arrayCopyOne = Arrays.copyOf(array, array.length);
        // int[] arrayCopyTwo = Arrays.copyOf(array, array.length);

        long startTime = System.currentTimeMillis();
        // bubble sort algorithm
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
        long timeSpent = System.currentTimeMillis() - startTime; // work time bubble sort algorithm
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");

        //selection sort algorithm
        long startTimeSelection = System.currentTimeMillis();
        for (int i = 0; i < arrayCopyOne.length; i++) {
            int minInd = i;
            for (int j = i; j < arrayCopyOne.length; j++) {
                if (arrayCopyOne[j] < arrayCopyOne[minInd]) {
                    minInd = j;
                }
            }
            swap(arrayCopyOne, minInd, i);
        }

        long timeSpentSelection = System.currentTimeMillis() - startTimeSelection; // work time selection sort algorithm
        System.out.println("программа выполнялась " + timeSpentSelection + " миллисекунд");
    }
}
