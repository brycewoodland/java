/*
Write a program that reads two integers from the user and prints the
square root of the sum of these integers. The program does not need to
work with negative values.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        double squareRoot = squareRoot(sum);
        System.out.println(squareRoot);
    }

    public static double squareRoot(int n) {
        return Math.sqrt(n);
    }
}