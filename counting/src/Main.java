/**
 * Write a program that reads an integer from the user.
 * Next, the program prints numbers from 0 to the number
 * given by the user. You can assume that the user always
 * gives a positive number. Below are some examples of
 * the expected functionality.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}