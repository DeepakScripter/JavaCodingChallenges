import java.util.Scanner;

public class DivisorSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // User input for finding the sum of divisors
        System.out.print("Enter a number to find the sum of its divisors: ");
        int num = scanner.nextInt();

        // Validate that the entered number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Calculate the sum of divisors
            int divisorSum = calculateDivisorSum(num);

            // Printing the sum of divisors
            System.out.println("Sum of divisors: " + divisorSum);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to calculate the sum of divisors for a given number
    private static int calculateDivisorSum(int number) {
        int divisorSum = 0;

        // Finding divisors and calculating their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum;
    }
}
