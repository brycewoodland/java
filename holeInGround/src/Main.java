/**
 * Create a method called printText which prints
 * the phrase "In a hole in the ground there lived
 * a method" and a newline. Expand the previous
 * program so that the main program asks the user
 * for the number of times the phrase will be printed
 * (i.e. how many times the method will be called).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int numberOfTimes = scan.nextInt();
        int start = 1;

        while (start <= numberOfTimes) {
            printText();
            start++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}