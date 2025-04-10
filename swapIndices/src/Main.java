import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template already contains a program, that creates an array and prints
 * the values of the array twice. Modify the program to do following: After the first
 * printing, the program should ask for two indices from the user. The values in these
 * two indices should be swapped, and in the end the values of the array should be printed
 * once again.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(3);
        numArray.add(5);
        numArray.add(7);
        numArray.add(9);

        for (int i = 0; i < numArray.size(); i++) {
            System.out.println(numArray.get(i));
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Give two indices to swap: ");
        int index1 = scan.nextInt();
        int index2 = scan.nextInt();

        int temp = numArray.get(index1);
        numArray.set(index1, numArray.get(index2));
        numArray.set(index2, temp);

        System.out.println("After Swapping:");
        for (int i = 0; i < numArray.size(); i++) {
            System.out.println(numArray.get(i));
        }

        scan.close();
    }
}