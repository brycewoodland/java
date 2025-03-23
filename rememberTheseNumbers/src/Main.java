import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that reads numbers from the user
 * and adds them to a list. Reading is stopped once the user enters the number -1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = buildList(scan);
        System.out.print("Search for? ");
        int numberToFind = scan.nextInt();
        ArrayList<Integer> indexList = indexOf(list, numberToFind);

        for (Integer index : indexList) {
            System.out.println(numberToFind + " is at index " + index);
        }

        scan.close();
    }

    public static ArrayList<Integer> buildList(Scanner scan) {
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number (-1 to quit): ");
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            numList.add(n);
        }
        return numList;
    }

    /**
     * Continue developing the program so that it finds
     * the greatest number in the list and prints its
     * value after reading all the numbers.
     */
    public static int getMax(ArrayList<Integer> list) {
        int max = 0;

        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public static ArrayList<Integer> indexOf(ArrayList<Integer> list, int numberToFind) {
        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == numberToFind) {
                indexList.add(i);
            }
        }
        return indexList;
    }
}


