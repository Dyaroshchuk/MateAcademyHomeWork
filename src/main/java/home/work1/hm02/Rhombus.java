package home.work1.hm02;

/**
 * 1.2 Нарисовать ромб с звёздочек заданной величины. Пример: величина 3,
 * значит максимальное кол-во звёзд в ряду будет 3.
 */

public class Rhombus {
    public static void printRhombus(int size) {
        int row = 1;

        // print top Rhombus
        for (int i = size; i > 0; i--) {
            printRhombusSymbols(row, i);
            row++;
        }

        // print bottom top Rhombus
        for (int i = 0; i < size - 1; i++) {
            // we need decrease row in 2 and i increase in 2 to use printRhombusSymbols
            printRhombusSymbols(row - 2, i + 2);
            row--;
        }
    }

    public static void printRhombusSymbols(int row, int spaces) {
        for (int j = 0; j <= spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= row; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printRhombus(7); // print Rhombus with max 7 "*"
        System.out.println();
        printRhombus(6); // print Rhombus with max 6 "*"
    }
}