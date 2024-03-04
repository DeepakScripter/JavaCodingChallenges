import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Convert the character to lowercase for easier comparison
            char lowercaseCh = Character.toLowerCase(ch);

            // Check if the character is a vowel or consonant
            if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
                    || lowercaseCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid alphabetic character.");
        }

        // Close the scanner
        scanner.close();
    }
}
