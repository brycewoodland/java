//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        christmasTree(4);
    }

    /**
     * Define a method called printSpaces(int number)
     * that produces the number of spaces specified by number.
     */
    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Define a method called printStars(int number)
     * that produces the number of stars specified by number.
     */
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Create a method called printTriangle(int size)
     * that prints a triangle by using the printStars method.
     */
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(2 * i - 1);
        }
    }

    /**
     * Define a method called christmasTree(int height)
     * that prints the correct Christmas tree. The Christmas
     * tree consists of a triangle with the specified
     * height as well as the base.
     */
    public static void christmasTree(int height) {

        // Print the tree
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Print the base
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}