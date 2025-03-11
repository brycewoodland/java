/**
 * Write a program, which reads an integer from the user.
 * Then the program prints numbers from that number to 100.
 * You can assume that the user always gives a number less
 * than 100.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}