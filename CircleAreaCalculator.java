import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = calculateCircleArea(radius);

        // Print the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a circle
    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
