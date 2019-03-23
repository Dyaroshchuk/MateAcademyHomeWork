package home.work1.hm04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.4 Сделать с помощью рекурсии: число Фибоначчи, факториал, Ряд Тейлора.
 */

public class Recursion {

        //Factorial
    public static int factorial(int a) {
        if (a > 1) {
            return a * factorial(--a);
        } else {
            return a;
        }
    }

        //Fibonacci numbers
    public static int fib(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fib(i - 1) + fib(i - 2);
    }

        //Taylor Row
    public static double taylorRow(int a, int x) {
        double result;
        if (a == 1) {
            return 1;
        }
        result = taylorRow(a - 1, x) + Math.pow(x, a - 1) / factorial(a - 1);
        return result;
    }



    public static void main(String[] args) {

        //Print 5! = 120;
        System.out.println(factorial(5));

        // fill massif Fibonacci numbers, size of array input from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of Fibonacci Array");
        int arraySize = scan.nextInt();
        int[] arrayFib = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayFib[i] = fib(i);
        }

        System.out.println(Arrays.toString(arrayFib));

        //Taylor Row
        System.out.println(taylorRow(5, 7));
    }
}
