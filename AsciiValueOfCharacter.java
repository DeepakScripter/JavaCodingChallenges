import java.util.Scanner;

public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert the character to its ASCII value
        int asciiValue = (int) ch;

        // Print the ASCII value
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
