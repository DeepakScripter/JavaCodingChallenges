import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Close the Scanner to avoid resource leaks
        sc.close();

        // Initialize the result to 1
        int result = 1;

        // Calculate the factorial using a for loop
        for (int i = number; i > 0; i--) {
            result *= i;
        }

        // Display the result
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
