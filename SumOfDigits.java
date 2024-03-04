import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = sumOfDigits(number);

        // Print the result
        System.out.println("Sum of digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
