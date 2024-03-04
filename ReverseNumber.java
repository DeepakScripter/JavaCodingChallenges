import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        // Print the result
        System.out.println("Reverse of " + number + " is: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a number
    private static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
