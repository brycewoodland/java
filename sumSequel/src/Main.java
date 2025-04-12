/**
 * Implement a program which calculates the sum of a closed interval,
 * and prints it. Expect the user to write the smaller number first
 * and then the larger number.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Last number: ");
        int lastNumber = scan.nextInt();
        int sum = 0;

        if (firstNumber > lastNumber) {
            System.out.println("The first number must smaller than last number.");
            return;
        }

        while (firstNumber <= lastNumber) {
            sum += firstNumber;
//            firstNumber++;
        }
        System.out.println(sum);
    }
}