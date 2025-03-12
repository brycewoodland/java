/**
 * Build a program that checks if a given number is prime.
 * Then find the first 100 prime numbers.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scan.nextInt();
//        boolean result = isPrime(num);
        ArrayList<Integer> output = firstHundredPrime();
        //System.out.println(result);
        System.out.println(output);
        //scan.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> firstHundredPrime() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int num = 2;

        while (primeNumbers.size() < 100) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }

        return primeNumbers;
    }
}