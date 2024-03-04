import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Validate if n is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
        } else {
            // Print the first 'n' natural numbers
            System.out.println("First " + n + " natural numbers:");

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }

            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
