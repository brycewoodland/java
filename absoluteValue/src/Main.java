/* Write a program that reads an integer from the user.
If the number is less than 0, the program prints the
given integer multiplied by -1. In all other cases, the
program prints the number itself.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int absoluteValueNum = absoluteValue(num);
        System.out.println(absoluteValueNum);
    }

    public static int absoluteValue(int n) {
        if (n >= 0) {
            return n;
        } else {
            return n * -1;
        }
    }
}