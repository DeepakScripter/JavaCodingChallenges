import java.util.Scanner;

public class PrintOddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        // Validate the range
        if (start > end) {
            System.out.println("Invalid range. The starting number should be less than or equal to the ending number.");
        } else {
            // Print odd numbers in the given range
            System.out.println("Odd numbers in the range " + start + " to " + end + ":");

            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
