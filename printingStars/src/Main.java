public class Main {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        /**
         *       Output:
         *       *****
         *       ***
         *       *********
         */
        System.out.println();

        printSquare(4);
        /**
         *       Output:
         *       ****
         *       ****
         *       ****
         *       ****
         */
        System.out.println();

        printRectangle(17, 3);
        /**
         *       Output:
         *       *****************
         *       *****************
         *       *****************
         */
        System.out.println();

        printTriangle(4);
        /**
         *       Output:
         *       *
         *       **
         *       ***
         *       ****
         */
    }

    /**
     * Define a method called printStars that prints
     * the given number of stars and a line break.
     */
    public static void printStars(int number) {
        int start = 1;

        while (start <= number) {
            System.out.print("*");
            start++;
        }
        System.out.println();
    }

    /**
     * Define a method called printSquare(int size) that
     * prints a suitable square with the help of the
     * printStars method.
     */
    public static void printSquare(int size) {
        int start = 1;

        while (start <= size) {
            printStars(4);
            start++;
        }
    }

    /**
     * Write a method called printRectangle(int width, int height)
     * that prints the correct rectangle by using the printStars method.
     */
    public static void printRectangle(int width, int height) {
        int start = 1;

        while (start <= width && start <= height) {
            printStars(17);
            start++;
        }
    }

    /**
     * Create a method called printTriangle(int size)
     * that prints a triangle by using the printStars method.
     */
    public static void printTriangle(int size) {
        int start = 1;

        while (start <= size) {
            printStars(start);
            start++;
        }
    }
}