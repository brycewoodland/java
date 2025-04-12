import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The exercise template already has an array containing numbers.
 * Complete the program so that it asks the user for a number to
 * search in the array. If the array contains the given number, the
 * program tells the index containing the number. If the array
 * doesn't contain the given number, the program will advise that
 * the number wasn't found.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 3, 11, 13, 7));

        Scanner scan = new Scanner(System.in);
        System.out.print("Search for? ");
        int numberSearch = scan.nextInt();

        int foundIndex = -1;

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == numberSearch) {
                foundIndex = i;
            }
        }

        if (foundIndex != -1) {
            System.out.printf("%d is at index %d%n", numberSearch, foundIndex);
        } else {
            System.out.printf("%d was not found.%n", numberSearch);
        }

        scan.close();
    }
}