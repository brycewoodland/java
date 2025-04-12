import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = buildList();
        int length = list.size();
        System.out.println("The length of the list: " + length);

        String lastItem = lastInList(list);
        System.out.println("The last item in list: " + lastItem);

        String firstItem = firstInList(list);
        System.out.println("The first item in list: " + firstItem);
    }

    /**
     * In the exercise template is a program that reads input from the user.
     * Modify its working so that when the program quits reading, the program
     * prints the number of values on the list.
     */
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

    /**
     * Your task is to modify the method to print the last read value
     * after it stops reading. Print the value that was read last from
     * the list. Use the method that tells the size of a list to help you.
     */
    public static String lastInList(ArrayList<String> stringList) {
        return stringList.getLast();
    }

    /**
     * Modify the program to print both the first and the last values
     * after the reading ends. You may suppose that at least two values
     * are read into the list.
     */
    public static String firstInList(ArrayList<String> stringList) {
        return stringList.getFirst();
    }

}