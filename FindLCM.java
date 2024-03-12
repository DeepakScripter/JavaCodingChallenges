import java.util.Scanner;
public class FindLCM {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the least common multiple (LCM) of the two numbers
        int lcmResult = findLCM(num1, num2);

        // Display the LCM to the user
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to find the least common multiple (LCM) using the greatest common
    // divisor (GCD)
    static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    // Function to find the greatest common divisor (GCD) using Euclidean algorithm
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
