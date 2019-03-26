package home.work1.hm02;

/**
 * 1.2 Нарисовать ромб с звёздочек заданной величины. Пример: величина 3,
 * значит максимальное кол-во звёзд в ряду будет 3.
 */

public class Rhombus {
    public static void printRhombus(int size) {
        int row = 0;
        for (int i = size; i > 0; i--) { // top Rhombus
            printRhombusSymbols(row, i);
            row++;
        }
        for (int i = 0; i < size; i++) { // bottom top Rhombus
            printRhombusSymbols(row, i);
            row--;
        }
    }

    public static void printRhombusSymbols(int row, int speces) {
        for (int j = 0; j <= speces; j++) {
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