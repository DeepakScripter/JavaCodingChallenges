import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for the multiplication table
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the given number
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
