import java.util.Scanner;

public class Magic_Number {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's a Magic Number: ");
        int num = scanner.nextInt();

        // Calculate the sum of digits until a single-digit sum is obtained
        int sumOfDigits = calculateSumOfDigits(num);

        // Check if the final sum is 1 to determine if it's a Magic Number
        if (sumOfDigits == 1) {
            System.out.println("Magic number");
        } else {
            System.out.println("Not a magic number");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to calculate the sum of digits until a single-digit sum is obtained
    private static int calculateSumOfDigits(int number) {
        int sumOfDigits = 0;

        while (number > 0 || sumOfDigits > 9) {
            if (number == 0) {
                number = sumOfDigits;
                sumOfDigits = 0;
            }

            sumOfDigits += number % 10;
            number /= 10;
        }

        return sumOfDigits;
    }
}
