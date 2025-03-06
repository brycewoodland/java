import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Welcome message
            System.out.println("Welcome to the basic calculator!");

            // Asking user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Asking user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Asking the user for the operation they want to perform
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Enter the number for your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            double result = 0; // To store the result

            // Perform the operation based on the user's choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result of multiplication is: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result of division is: " + result);
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }

            // Ask user if they want to perform another calculation
            System.out.print("Would you like to perform another calculation? (yes/no): ");
            String again = scanner.next();
            if (!again.equalsIgnoreCase("yes")) {
                break;  // Exit the loop if the user doesn't want to continue
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
