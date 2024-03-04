import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a month number
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        // Validate the input
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            // Determine the number of days in the month
            int daysInMonth = getDaysInMonth(monthNumber);

            // Print the result
            System.out.println("Number of days in month " + monthNumber + ": " + daysInMonth);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to get the number of days in a month
    private static int getDaysInMonth(int month) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return 28; // Assuming a non-leap year, you may want to add leap year logic
            default:
                return -1; // Invalid month
        }
    }
}
