import java.util.Scanner;

// Custom exception to handle age validation
class AgeDoesNotMatchException extends RuntimeException {
    public AgeDoesNotMatchException(String message) {
        super(message);
    }
}

// Class representing a Student
class Student {
    private String name;
    private int age;

    // Constructor with age validation
    public Student(String name, int age) {
        try {
            // Validate age, throw exception if not between 17 and 24
            if (age < 17 || age > 24) {
                String errorMessage = "Age must be between 17 and 24 (inclusive)";
                AgeDoesNotMatchException ex = new AgeDoesNotMatchException(errorMessage);
                throw ex;
            }
        } catch (AgeDoesNotMatchException e) {
            // Print exception details for debugging purposes
            e.printStackTrace();
        }

        // Initialize instance variables
        this.name = name;
        this.age = age;
    }

    // Display method to print student details
    public void display() {
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Age of the Student: " + this.age);
    }

    // Main method to take input and create Student object
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the Student: ");
        String name = scanner.next();

        System.out.println("Enter the age of the Student (should be 17 to 24, inclusive): ");
        int age = scanner.nextInt();

        try {
            // Create Student object and display details
            Student obj = new Student(name, age);
            obj.display();
        } catch (AgeDoesNotMatchException e) {
            // Handle the exception gracefully by printing a user-friendly message
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
   
}
