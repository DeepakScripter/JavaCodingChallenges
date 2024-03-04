import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);

        // Print the result
        if (isPerfect) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a perfect number
    private static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // Initialize sum with 1 (1 is always a divisor)

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
