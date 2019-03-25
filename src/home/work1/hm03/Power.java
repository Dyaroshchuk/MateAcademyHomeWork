package home.work1.hm03;

/**
 * 1.3 Возвести число в квадрат, куб, степень. Важно: не использовать Math.pow().
 */

public class Power {
    public static int myPow(int number, int pow) {
        if (pow == 0) {
            return 1;
        } else {
        int result = number;
        for (int i = 1; i < pow; i++) {
            result *= number;
        }
        return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(12, 2)); // check pow result 144
    }
}