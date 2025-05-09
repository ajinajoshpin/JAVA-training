public class CheckParenthesis {
    // Method to check if parentheses in the string are valid
    public static boolean isValid(String s) {
        int count = 0; // Initialize a count variable to track open parentheses
        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++; // Increment count for open parentheses
            } else if (ch == ')') {
                // If closing parenthesis found and no open parentheses to match, return false
                if (count == 0) return false; 
                count--; // Decrement count for closing parenthesis
            }
        }
        // Return true if all parentheses are matched, else false
        return count == 0;
    }

    public static void main(String[] args) {
        // Test cases to check if the parentheses are valid
        System.out.println(isValid("()()"));     // Expected: true
        System.out.println(isValid("((())())")); // Expected: true
        System.out.println(isValid("(()"));      // Expected: false
        System.out.println(isValid("())"));      // Expected: false
    }
}
