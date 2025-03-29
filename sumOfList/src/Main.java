import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that reads numbers
 * from the user and adds them to a list. Reading is stopped
 * once the user enters the number -1.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numList = buildList(scan);
        System.out.println("Sum: " + sum(numList));
        System.out.println("Average: " + average(numList));
        scan.close();
    }

    /**
     * Method to build the list until user enters -1
     */
    public static ArrayList<Integer> buildList(Scanner scan) {
        ArrayList<Integer> numList = new ArrayList<>();

        while ( true ) {
            System.out.print("Enter a number (-1 to quit): ");
            int input = scan.nextInt();

            if ( input == -1 ) {
                break;
            }
            numList.add( input );
        }
        return numList;
    }

    /**
     * Method to calculate the sum of the list
     */
    public static int sum(ArrayList<Integer> numList) {
        int sum = 0;
        for ( int number : numList ) {
            sum += number;
        }
        return sum;
    }

    /**
     * Method to calculate the average of the list.
     */
    public static double average(ArrayList<Integer> numList) {
        double sum = 0;
        for (int number : numList) {
            sum += number;
        }
        return sum / numList.size();
    }
}