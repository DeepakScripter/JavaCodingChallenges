public class BitwiseLeftShiftExample {
    public static void main(String[] args) {
        // Given value for x
        byte x = 64;

        // Variable to store the result without type casting
        int i;

        // Variable to store the result with type casting to byte
        byte y;

        // Perform bitwise left shift on x by 2 positions and store in i
        i = x << 2;

        // Perform bitwise left shift on x by 2 positions and cast the result to byte,
        // store in y
        y = (byte) (x << 2);

        // Print the results
        System.out.println("Result without casting: " + i);
        System.out.println("Result with casting to byte: " + y);
    }
}
