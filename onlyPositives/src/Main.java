/**
 * Write a program that asks the user for numbers.
 * If the number is negative (smaller than zero),
 * the program prints for user "Unsuitable number"
 * and asks the user for a new number. If the number
 * is zero, the program exits the loop. If the number
 * is positive, the program prints the number to the
 * power of two.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = s.nextInt();

            if (isPositive(number)) {
                System.out.println("The number to the power of two " + (number * number));
            } else if (isNegative(number)) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }
        }

        System.out.println("Exiting the program.");
    }

    public static boolean isNegative(int n) {
        return n < 0;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }
}