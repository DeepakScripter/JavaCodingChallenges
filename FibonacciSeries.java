import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        // Display a message indicating the start of the Fibonacci series
        System.out.println("Fibonacci Series:");

        // Iterate through the specified number of terms in the series
        for (int i = 0; i < n; ++i) {
            // Print the current term in the series
            System.out.print(firstTerm + " ");

            // Calculate the next term by adding the current two terms
            int nextTerm = firstTerm + secondTerm;

            // Update the first and second terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
