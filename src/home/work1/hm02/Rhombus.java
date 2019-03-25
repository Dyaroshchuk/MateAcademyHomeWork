package home.work1.hm02;

/**
 * 1.2 Нарисовать ромб с звёздочек заданной величины. Пример: величина 3,
 * значит максимальное кол-во звёзд в ряду будет 3.
 */

public class Rhombus {
    public static void printRhombus(int size) {
        size = size / 2;
        for (int i = 1; i < size + 1; ++i) { // Rhombus top
            printRhombusSymbols(size, i);
        }
        for (int i = size + 1; i >= 1; --i) { // Rhombus bottom
            printRhombusSymbols(size, i);
        }
    }

    // method which will print " " and "*" for Rhombus
    public static void printRhombusSymbols(int size, int index) {
        for (int j = size + 1; j > index; --j) {
            System.out.print(" ");
        }

        for (int j = 1; j < 2 * index; ++j) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printRhombus(14); // print diamond
    }
}