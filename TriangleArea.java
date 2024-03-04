
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input lengths of the sides
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Print the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
