import java.util.ArrayList;
import java.util.Scanner;

/**
 * In the exercise template there is a program that reads integers
 * from the user and adds them to a list. This ends when the user
 * enters 0. The program then prints the first value on the list.
 * Modify the program so that instead of the first value, the
 * program prints the sum of the second and third numbers. The
 * program is allowed to malfunction if there are fewer than three
 * entries on the list, so you don't need to prepare for such an
 * event at all.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = buildList();
        int output = getIndexes(list);
        System.out.print(output);
    }

    public static ArrayList<Integer> buildList() {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            int n = scan.nextInt();
            if (n == 0) {
                 break;
            }
            numberList.add(n);
//        }
        return numberList;
    }

    public static int getIndexes(ArrayList<Integer> numberList) {
        int num1 = numberList.get(1);
        int num2 = numberList.get(2);

        return num1 + num2;
    }
}