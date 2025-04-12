/**
 * Write a method public static void divisibleByThreeInRange(int beginning, int end)
 * that prints all the numbers divisible by three in the given range. The numbers
 * are to be printed in order from the smallest to the greatest.
 */

public class Main {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            if (beginning % 3 == 0) {
//                System.out.println(beginning);
            }
            beginning++;
        }
    }
}