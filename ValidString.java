import java.util.Stack;

public class ValidString {

    public static void main(String[] args) {
        // Input string to be checked for validity
        String input = "{[()]}";

        // Check if the input string is valid
        boolean isValid = isValidString(input);

        // Display the result based on whether the string is valid or not
        if (isValid) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }

    // Function to check if a string containing only parentheses, square brackets,
    // and curly braces is valid
    private static boolean isValidString(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // If the character is a closing bracket and matches the top of the stack, pop
            // the stack
            else if ((c == ')' || c == ']' || c == '}') && !stack.isEmpty() && isMatchingPair(stack.peek(), c)) {
                stack.pop();
            }
            // If the character is a closing bracket but does not match the top of the
            // stack, return false
            else {
                return false; // Invalid character or mismatched brackets
            }
        }

        // If the stack is empty, all opening brackets had corresponding closing
        // brackets, so the string is valid
        return stack.isEmpty();
    }

    // Function to check if two characters represent a matching pair of opening and
    // closing brackets
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
