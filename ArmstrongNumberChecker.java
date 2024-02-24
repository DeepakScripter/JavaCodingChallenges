import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        int originalNumber, remainder, result = 0;
        int numberOfDigits = 0;

        // Count the number of digits in the input number
        originalNumber = number;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }

        originalNumber = number; // Reset originalNumber to the input value

        // Calculate the sum of digits, each raised to the power of the number of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;

            // Using Math.pow to calculate the power of the remainder
            result += Math.pow(remainder, numberOfDigits);

            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
