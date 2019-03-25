package home.work1.hm06;

import java.util.Arrays;

/**
 * 1.6 Различные задачи с матрицами
 * (найти диагональ, минимальные максимальные элементы, сортировка, и пр)
 * 1.6 (минимальные максимальные элементы)
 */

public class Matrix {
        // method which return Max value of array
    public static int getMax(int[][] matrix) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = Math.max(result, matrix[i][j]);
            }
        }
        return result;
    }

    // method which return Min value of array
    public static int getMin(int[][] matrix) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = Math.min(result, matrix[i][j]);
            }
        }
        return result;
    }

    public static int[][] fillMatrix(int sizeRow, int sizeColumn) {
        int[][] matrix = new int[sizeColumn][sizeRow];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5,6);

        System.out.println(Arrays.deepToString(matrix)); // print array to see array values
        System.out.println();
        System.out.println("Max value of 2D array is: " + getMax(matrix)); // check max
        System.out.println("Max value of 2D array is: " + getMin(matrix)); // check min
    }
}
