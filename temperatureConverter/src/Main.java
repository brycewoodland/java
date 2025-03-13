/**
 * Develop a program that converts temperatures between Celsius, Fahrenheit, and Kelvin.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What temperature scale are you using?");
        System.out.print("Enter 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin: ");
        char scale = scan.next().charAt(0);

        scale = Character.toUpperCase(scale);
        scan.close();
    }

    private static void handleConversion() {

    }
}