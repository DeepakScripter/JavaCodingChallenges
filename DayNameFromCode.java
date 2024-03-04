import java.util.Scanner;

public class DayNameFromCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a day code
        System.out.print("Enter a day code (1-7): ");
        int dayCode = scanner.nextInt();

        // Validate the input
        if (dayCode < 1 || dayCode > 7) {
            System.out.println("Invalid day code. Please enter a number between 1 and 7.");
        } else {
            // Determine the day name
            String dayName = getDayName(dayCode);

            // Print the result
            System.out.println("The corresponding day is: " + dayName);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to get the day name from the day code
    private static String getDayName(int code) {
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return daysOfWeek[code - 1];
    }
}
