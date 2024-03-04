import java.util.Scanner;

public class GreatestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        

        // Input the array elements
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the greatest number in the array
        int maxNumber = numbers[0]; // Assume the first element as the maximum

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Print the result
        System.out.println("The greatest number in the array is: " + maxNumber);

        // Close the scanner
        scanner.close();
    }
}
