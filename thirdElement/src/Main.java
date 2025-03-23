/**
 * The exercise contains a base that asks the user for strings and adds them to a list.
 * The program stops reading when the user enters an empty string. The program then prints
 * the first element of the list.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Your assignment is to modify the program so that instead of the first value, the third
 * value on the list is printed. Remember that programmers start counting from zero! The
 * program is allowed to malfunction if there are fewer than three entries on the list,
 * so you don't need to prepare for such an event at all.
 */
public class Main {
    public static void main(String[] args) {
            String output = thirdElement();
            System.out.println(output);
        }

    public static String thirdElement() {
        ArrayList<String> stringList = new ArrayList<>(); // Create an empty list
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or press enter to stop): ");
            String s = scan.nextLine(); // Gets the input from the user
            if (s.isEmpty()) { // If the response is empty it will break
                break;
            }
            stringList.add(s); // Add the string to the list
        }
        scan.close();
        return stringList.get(2); // Grab the third index from the string
    }
}