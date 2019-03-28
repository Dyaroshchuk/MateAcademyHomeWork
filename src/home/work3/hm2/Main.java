package home.work3.hm2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArraysMethods arraysMethods = new ArraysMethods();
        int[] arrayOne = arraysMethods.fillArray(7);
        int[] arrayTwo = arraysMethods.fillArray(7);

        // sorting arrays
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        // merging arrays to one
        int[] arrayMerged = arraysMethods.merge(arrayOne, arrayTwo);

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayMerged));
    }
}
