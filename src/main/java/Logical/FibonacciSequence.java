package Logical;

import java.util.Scanner;

/**
 * Created by anjalhussan on 10/24/17.
 */
public class FibonacciSequence {

    /*
    Find the Fibonacci Sequence upto given number
     */

    public static void main(String[] args) {


        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        if (number > 0) {
            System.out.println("Fibonacci series upto " + number + " numbers : ");
            //printing Fibonacci series upto number
            System.out.print(0 + " ");
            for (int i = 1; i <= number; i++) {
                System.out.print(findfibonacci(i) + " ");
            }
        } else {
            System.out.println("Input must be greater than Zero");
        }
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */

    private static int findfibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }

    /*
 * Java program for Fibonacci number using recursion.
 * This program uses tail recursion to calculate Fibonacci number for a given number
 * @return Fibonacci number
 */
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion

    }
}
