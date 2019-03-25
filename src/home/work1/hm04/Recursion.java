package home.work1.hm04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.4 Сделать с помощью рекурсии: число Фибоначчи, факториал, Ряд Тейлора.
 */

public class Recursion {
    // Factorial
    public static int factorial(int count) {
        if (count > 1) {
            return count * factorial(--count);
        } else {
            return count;
        }
    }

    // Fibonacci numbers
    public static int fibonacci(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    // Taylor Row
    public static double taylorRow(int number, int count) {
        double result;
        if (count == 0) {
            return 1;
        }
        result = taylorRow(number, count - 1) + Math.pow(number, count - 1) / factorial(count - 1);;
        return result;
    }

    public static void main(String[] args) {
        // Print 5! = 120;
        System.out.println(factorial(5));

        // fill massif Fibonacci numbers, size of array input from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of Fibonacci Array");
        int arraySize = scan.nextInt();
        int[] arrayFib = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayFib[i] = fibonacci(i);
        }

        System.out.println(Arrays.toString(arrayFib));

        // Taylor Row
        System.out.println(taylorRow(5, 7));
    }
}
