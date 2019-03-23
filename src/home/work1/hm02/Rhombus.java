package home.work1.hm02;

/**
 * 1.2 Нарисовать ромб с звёздочек заданной величины. Пример: величина 3,
 * значит максимальное кол-во звёзд в ряду будет 3.
 */

public class Rhombus {

    public static void printRhomb(int size) {
        size = size / 2;
        for (int i = 1; i < size + 1; ++i) { // diamond top

            for (int j = size + 1; j > i; --j) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2 * i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = size + 1; i >= 1; --i) { //diamond bottom

            for (int j = size + 1; j > i; --j) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {

        printRhomb(14); // print diamond
    }
}
