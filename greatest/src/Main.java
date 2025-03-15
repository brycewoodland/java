/**
 * Write two methods: The first will find the greatest
 * The second will find the smallest
 */

public class Main {
    public static void main(String[] args) {
        int greatest = greatest(2, 7, 3);
        System.out.println("Greatest: " + greatest);

        int smallest = smallest(2, 7);
        System.out.println("Smallest: " + smallest);
    }

    /**
     * Define a method called greatest that takes three numbers
     * and returns the greatest of them. If there are multiple
     * greatest values, returning one of them is enough
     */
    public static int greatest(int number1, int number2, int number3) {
        int firstLarger = Math.max(number1, number2);
        return Math.max(firstLarger, number3);
    }

    /**
     * Define a two-parameter method smallest that returns
     * the smaller of the two numbers passed to it as parameters.
     */
    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }

}