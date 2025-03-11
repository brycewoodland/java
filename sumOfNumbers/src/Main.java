/**
 * Write a program that reads numbers from the user until the user inputs a number 0.
 * After this the program outputs the sum of the numbers. The number zero does not
 * need to be added to the sum, even if it does not change the results.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
        scan.close();
    }
}