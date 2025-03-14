/**
 * Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number: ");
        int lastNum = scan.nextInt();
        int start = 1;
        int sum = 0;

        while (start <= lastNum) {
            sum += start;
            start++;
        }

        System.out.println(sum);
    }
}