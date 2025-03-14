/**
 * Write a program which prints the integers from 1 to a number given by the user.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Where From: ");
        int start = scan.nextInt();

        System.out.print("Where To: ");
        int whereTo = scan.nextInt();

        if (start > whereTo) {
            return;
        }

        while (start <= whereTo) {
            System.out.println(start);
            start++;
        }
    }
}