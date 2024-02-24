public class VariableScopeDemo {
    public static void main(String[] args) {
        int x; // Declaration of variable x
        x = 5; // Initialization of x with the value 5

        // Block with a local variable y
        {
            int y = 6; // Declaration and initialization of variable y within the block
            System.out.print(x + " " + y); // Print the values of x and y within the block
        }

        // The following line will result in a compilation error
        // System.out.println(x + " " + y); // Uncommenting this line will cause an
        // error as y is not accessible here
    }
}
