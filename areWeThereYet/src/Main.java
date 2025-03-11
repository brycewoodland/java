/**
 * Write a program, according to the preceding example,
 * that asks the user to input values until they input
 * the value 4.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int expectedAnswer = 4;

        while (true) {
            System.out.print("Enter a number: ");
            int answer = Integer.parseInt(s.nextLine());

            if (answer == expectedAnswer) {
                System.out.println("You guessed it!");
                break;
            }
        }
    }
}