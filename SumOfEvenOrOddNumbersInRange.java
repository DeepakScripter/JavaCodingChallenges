import java.util.Scanner;

public class SumOfEvenOrOddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        // Validate the range
        if (start >= end) {
            System.out.println("Invalid range. Please ensure the starting number is less than the ending number.");
        } else {
            // Input whether to calculate the sum of even or odd numbers
            System.out.print("Enter 'even' or 'odd' to calculate the sum: ");
            String sumType = scanner.next().toLowerCase();

            int sum = 0;

            // Calculate and print the sum based on user input
            for (int i = start; i <= end; i++) {
                if (sumType.equals("even") && i % 2 == 0) {
                    sum += i;
                } else if (sumType.equals("odd") && i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.println("Sum of " + sumType + " numbers in the range [" + start + ", " + end + "] is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}
