/**
 * Write a program that reads values from the user until they input a 0.
 * After this, the program prints the total number of inputted values.
 * The zero that's used to exit the loop should not be included in the
 * total number count.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        while(true) {
            System.out.print("Enter a number: ");
            int userInput = scan.nextInt();

            if (userInput == 0) {
                break;
            }
            count += 1;
        }
        System.out.println("Number of numbers: " + count);
    }
}