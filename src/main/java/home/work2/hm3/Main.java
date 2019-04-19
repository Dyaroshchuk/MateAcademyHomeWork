package home.work2.hm3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortUtils sort = new SortUtils();
        int[] arrayForBubble = sort.fillArray(10);
        int[] arrayForSelection = sort.fillArray(10);
        int[] arrayForMerge = sort.fillArray(10);

        // check Bubble sort
        System.out.println("Before bubble sort " + Arrays.toString(arrayForBubble));
        sort.bubbleSort(arrayForBubble);
        System.out.println("After bubble sort " + Arrays.toString(arrayForBubble));

        // check Selection sort
        System.out.println("Before Selection sort " + Arrays.toString(arrayForSelection));
        sort.selectionSort(arrayForSelection);
        System.out.println("After Selection sort " + Arrays.toString(arrayForSelection));

        // check Bubble sort
        System.out.println("Before Merge sort " + Arrays.toString(arrayForMerge));
        int[] arrayForMergeorted = sort.mergeSort(arrayForMerge);
        System.out.println("After Merge sort " + Arrays.toString(arrayForMergeorted));

    }
}
