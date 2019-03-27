package home.work2.hm3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortUtils sort = new SortUtils();
        int[] arrayForBubble = sort.fillArray(10);
        int[] arrayForSelection = sort.fillArray(10);
        int[] arrayForMerge = sort.fillArray(10);

        // check Bubble sort
        System.out.println("bubble " + Arrays.toString(arrayForBubble));
        sort.bubbleSort(arrayForBubble);
        System.out.println("bubble " + Arrays.toString(arrayForBubble));

        // check Selection sort
        System.out.println("Selection " + Arrays.toString(arrayForSelection));
        sort.selectionSort(arrayForSelection);
        System.out.println("Selection " + Arrays.toString(arrayForSelection));

        // check Bubble sort
        System.out.println("Merge " + Arrays.toString(arrayForMerge));
        int[] arrayForMergeorted = sort.mergeSort(arrayForMerge);
        System.out.println("Merge " + Arrays.toString(arrayForMergeorted));

    }
}
