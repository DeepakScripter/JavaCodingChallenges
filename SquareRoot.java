import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square root
        double squareRoot = Math.sqrt(number);

        // Print the result
        System.out.println("Square root of " + number + " is: " + squareRoot);

        // Close the scanner
        scanner.close();
    }
}
