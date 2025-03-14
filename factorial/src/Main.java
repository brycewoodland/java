/**
 * Implement a program which calculates the factorial of a number given by the user.
 * Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example, the
 * factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified
 * that the factorial of 0 is 1, so 0! = 1.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = scan.nextInt();
        int start = 1;
        int product = 1;

        while (start <= number) {
            product *= start;
            start++;
        }
        System.out.println(product);
    }
}