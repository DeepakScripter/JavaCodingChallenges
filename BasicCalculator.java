import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Select an operation (1-4): ");

        int choice = scanner.nextInt();

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the selected operation
        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Invalid choice. Please select a valid operation.");
            return;
        }

        // Print the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
