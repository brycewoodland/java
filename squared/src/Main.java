import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = squared(num);
        System.out.println(result);
    }

    public static int squared(int n) {
        return n * n;
    }
}