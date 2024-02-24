import java.util.Scanner;

public class SumCheckIsPrime {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Iterate from 2 to the square root of num to check for divisibility
        for (int j = 2; j <= Math.sqrt(num); j++) {
            // If num is divisible by j, it's not prime
            if (num % j == 0) {
                return false;
            }
        }
        // If no divisor is found, num is prime
        return true;
    }

    // Function to find and display prime pairs that sum up to the given number
    static void findPrimePair(int num) {
        boolean found = false;
        // Iterate through numbers from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            // Check if both i and (num - i) are prime using isPrime method
            if (isPrime(i) && isPrime(num - i)) {
                // If prime pairs found, print the pair and set found to true
                System.out.println(num + " = " + i + " + " + (num - i));
                found = true;
            }
        }
        // If no prime pairs are found, print a message
        if (!found) {
            System.out.println("No prime pairs found for the given number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();
        // Call the findPrimePair method to check and display prime pairs
        findPrimePair(num);
    }
}
