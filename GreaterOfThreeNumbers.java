import java.util.Scanner;

public class GreaterOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the greater number
        int maxNumber = Math.max(Math.max(num1, num2), num3);

        // Print the result
        System.out.println("The greater number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNumber);

        // Close the scanner
        scanner.close();
    }
}
