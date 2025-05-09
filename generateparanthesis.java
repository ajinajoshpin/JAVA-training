import java.util.ArrayList;

public class GenerateParenthesis {
    
    public static void main(String[] args) {
        int n = 3;  // Number of pairs of parentheses
        ArrayList<String> list = new ArrayList<>();
        
        // Title for output
        System.out.println("========== Generate Parentheses ==========");
        
        // Generate all valid parentheses combinations and store in list
        generate(list, n, "", 0, 0);
        
        // Print the result
        System.out.println(list);
    }
    
    // Recursive function to generate valid parentheses combinations
    public static void generate(ArrayList<String> list, int n, String str, int open, int close) {
        // If the string length reaches 2*n, we have a valid combination of parentheses
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }
        
        // Add an opening parenthesis if we haven't used all of them
        if (open < n) {
            generate(list, n, str + "{", open + 1, close);
        }
        
        // Add a closing parenthesis if there are more open parentheses than closed ones
        if (close < open) {
            generate(list, n, str + "}", open, close + 1);
        }
    }
}
