import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Validate if n is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
        } else {
            // Calculate the sum of the first 'n' natural numbers
            int sum = (n * (n + 1)) / 2;

            // Print the sum
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}
