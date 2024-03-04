import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility for voting
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        // Close the scanner
        scanner.close();
    }
}
