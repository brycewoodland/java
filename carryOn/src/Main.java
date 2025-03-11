/**
 * Write a program by using the loop example that asks "Shall we carry on?"
 * until the user inputs the string "no".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Shall we carry on?");
            answer = s.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Goodbye!");
    }
}