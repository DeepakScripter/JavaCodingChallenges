import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base and exponent
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using Math.pow()
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
