import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        // Validate if the number is non-negative
        if (num < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate the factorial
            long factorial = calculateFactorial(num);

            // Print the result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
