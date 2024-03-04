import java.util.Scanner;

public class MaximumNumberBetweenTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum number
        int maxNumber = (num1 > num2) ? num1 : num2;

        // Print the maximum number
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + maxNumber);

        // Close the scanner
        scanner.close();
    }
}
