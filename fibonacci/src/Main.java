/**
 * Implement a function to generate Fibonacci numbers up to a given number of terms.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scan.nextInt();
        List<Integer> output = fibonacci(limit);
        System.out.print(output);
    }

    public static List<Integer> fibonacci(int limit) {
        List<Integer> fibNumbers = new ArrayList<>();
        int a = 0, b = 1;

        fibNumbers.add(a);
        fibNumbers.add(b);

        while(a + b <= limit) {
            int next = a + b;
            fibNumbers.add(next);
            a = b;
            b = next;
        }

        return fibNumbers;
    }
}
