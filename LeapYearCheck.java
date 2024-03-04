import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}
