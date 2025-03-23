import java.util.ArrayList;
import java.util.Scanner;

/**
 * In the exercise template is a program that reads input from the user.
 * Modify its working so that when the program quits reading, the program
 * prints the number of values on the list.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = buildList();
        int length = list.size();
        System.out.println("The length of the list: " + length);
    }

    public static ArrayList<String> buildList() {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or enter to quit): ");
            String s = scan.nextLine();
            if (s.isEmpty()) {
                break;
            }
            stringList.add(s);
        }
        scan.close();
        return stringList;
    }
}