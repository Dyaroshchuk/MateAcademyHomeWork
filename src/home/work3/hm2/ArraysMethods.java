package home.work3.hm2;

public class ArraysMethods {

    // fill array random values
    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param arrayLeft  first sorted array
     * @param arrayRight second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
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
}
