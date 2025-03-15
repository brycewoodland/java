/**
 * Writing custom methods in Java with parameters.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("The First Method:");
        printUntilNumber(5);

        System.out.println("The Second Method:");
        printFromNumberToOne(5);
    }

    /**
     * Create the following method in the exercise template:
     * public static void printUntilNumber(int number). It should
     * print the numbers from one to the number passed as a parameter.
     */
    public static void printUntilNumber(int number) {
        int start = 1;

        while (start <= number) {
            System.out.println(start);
            start++;
        }
    }

    /**
     * Create the following method in the exercise template:
     * public static void printFromNumberToOne(int number).
     * It should print the numbers from the number passed
     * as a parameter down to one.
     */
    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}