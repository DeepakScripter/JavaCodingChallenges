import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // User input for checking a Perfect Number
        System.out.println("Enter a number to check for Perfect Number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Loop to find the factors and calculate the sum
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the number is a Perfect Number
        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
