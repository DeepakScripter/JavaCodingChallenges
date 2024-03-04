import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = calculateRectangleArea(length, width);

        // Print the result
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a rectangle
    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
