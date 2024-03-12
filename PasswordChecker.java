import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Define the valid password (replace with your desired valid password)
        final String validPassword = "secret123";

        String enteredPassword;

        // Loop until a valid password is entered
        do {
            // Prompt the user to enter the password
            System.out.print("Enter the password: ");
            enteredPassword = scanner.nextLine();

            // Check if the entered password matches the valid password
            if (enteredPassword.equals(validPassword)) {
                // If the passwords match, display a success message and exit the loop
                System.out.println("Login successful! Welcome.");
                break;
            } else {
                // If the passwords don't match, display an error message and continue the loop
                System.out.println("Incorrect password. Try again.");
            }

        } while (true); // Infinite loop until a valid password is entered

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
