/*
Write a program that reads two integers from the user.
If the first number is greater than the second, the
program prints "(first) is greater than (second)." If
the first number is less than the second, the program
prints "(first) is smaller than (second)." Otherwise,
the program prints "(first) is equal to (second)." The
(first) and (second) should always be replaced with the
actual numbers that were provided by the user.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        String output = compareNumbers(num1, num2);
        System.out.println(output);
    }

    public static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1 + " is greater than " + num2;
        } else if (num1 == num2) {
            return num1 + " is equal to " + num2;
        } else {
            return num1 + " is less than " + num2;
        }

    }
}