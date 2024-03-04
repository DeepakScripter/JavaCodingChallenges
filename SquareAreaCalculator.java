import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the side length of the square
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area of the square
        double area = calculateSquareArea(sideLength);

        // Print the result
        System.out.println("The area of the square with side length " + sideLength + " is: " + area);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a square
    private static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }
}
