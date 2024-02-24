public class DivisionExamples {
    public static void main(String[] args) {
        // Declare variables for division results
        double a, b, c;

        // Division by zero, results in positive infinity
        a = 3.0 / 0;
        // Output: Infinity
        System.out.println("Result of 3.0 / 0: " + a);

        // Zero divided by any non-zero number is zero
        b = 0 / 4.0;
        // Output: 0.0
        System.out.println("Result of 0 / 4.0: " + b);

        // Indeterminate form, results in NaN (Not a Number)
        c = 0 / 0.0;
        // Output: NaN
        System.out.println("Result of 0 / 0.0: " + c);
    }
}
