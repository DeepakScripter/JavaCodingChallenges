class MyClass {
    int number;

    // Default constructor that initializes and displays the number
    MyClass() {
        System.out.println("Number: " + number);
    }

    // Method to display the number
    void displayNumber() {
        System.out.println("Number: " + number);
    }
}

// Class to test MyClass
class TestMyClass {
    public static void main(String[] args) {
        // Creating objects of MyClass without explicitly defined constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Setting values for the number field
        obj1.number = 10;
        obj2.number = 20;

        // Calling the method to display the numbers
        obj1.displayNumber(); // Output: Number: 10
        obj2.displayNumber(); // Output: Number: 20
    }
}
