package coadingchallenges;
import java.util.Scanner;

public class FindGCD {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the findGCD method to calculate the GCD of the two numbers
        int gcdResult = findGCD(num1, num2);

        // Display the result to the user
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);

        // Close the scanner to release resources
        scanner.close();
    }

    // Method to find the Greatest Common Divisor (GCD) using Euclidean algorithm
    static int findGCD(int a, int b) {
        while (b != 0) {
            // Temporary variable to store the value of b
            int temp = b;
            // Update b to be the remainder when a is divided by b
            b = a % b;
            // Update a to be the previous value of b
            a = temp;
        }
        // The absolute value of a is the GCD of the two numbers
        return Math.abs(a);
    }
}
