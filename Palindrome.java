import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for palindrome check
        System.out.print("Enter a number to check if it's a palindrome: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int reversedNumber = 0;

        // Reversing the digits to check for palindrome
        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        // Checking if the reversed number is equal to the original
        if (reversedNumber == originalNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
