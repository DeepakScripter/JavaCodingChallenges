import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the annual income
        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        // Calculate tax based on a simple tax rate
        double taxRate = 0.15; // Example tax rate, you can adjust this value
        double tax = annualIncome * taxRate;

        // Print the result
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Income Tax: $" + tax);

        // Close the scanner
        scanner.close();
    }
}
