import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the number of digits
        int digitCount = countDigits(number);

        // Print the result
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of digits in an integer
    private static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for 0
        }

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
