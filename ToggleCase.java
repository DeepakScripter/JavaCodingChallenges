import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Toggle case
        char toggledChar;

        if (Character.isUpperCase(inputChar)) {
            toggledChar = Character.toLowerCase(inputChar);
        } else if (Character.isLowerCase(inputChar)) {
            toggledChar = Character.toUpperCase(inputChar);
        } else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
            scanner.close();
            return;
        }

        // Print the result
        System.out.println("Toggled case: " + toggledChar);

        // Close the scanner
        scanner.close();
    }
}
