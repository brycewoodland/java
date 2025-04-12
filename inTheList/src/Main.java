import java.util.ArrayList;
import java.util.Scanner;

/**
 * In the exercise template there is a program that reads inputs
 * from the user until an empty string is entered. Add the following
 * functionality to it: after reading the inputs one more string is
 * requested from the user. The program then tell whether that string
 * was found in the list or not.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nameList = buildList(scan);
//        findName(nameList, scan);
        scan.close();
    }

    public static ArrayList<String> buildList(Scanner scan) {
        ArrayList<String> nameList = new ArrayList<>();

        while ( true ) {
            System.out.print("Enter a name (press enter to quit): ");
            String input = scan.nextLine();
            if ( input.isEmpty() ) {
                break;
            }
            nameList.add(input);
        }
        return nameList;
    }

    public static void findName(ArrayList<String> nameList, Scanner scan) {
        System.out.print("Search for? ");
        String nameToFind = scan.nextLine();

        if ( nameList.contains(nameToFind) ) {
            System.out.println(nameToFind + " was found!");
        } else {
            System.out.println(nameToFind + " was not found!");
        }
    }
}