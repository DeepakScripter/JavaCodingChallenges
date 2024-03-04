import java.util.Scanner;

public class SubjectMarksCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");

        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        System.out.print("Subject 5: ");
        int subject5 = scanner.nextInt();

        // Calculate total, average, and percentage
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double averageMarks = totalMarks / 5.0;
        double percentage = (totalMarks / 500.0) * 100;

        // Print the result
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Close the scanner
        scanner.close();
    }
}
