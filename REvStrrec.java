import java.util.Scanner;

public class RevStrRec {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt for user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();  // User input
        scanner.close();

        // Display the reversed string
        System.out.println("Reversed string: " + rev(input));
    }

    // Recursive method to reverse the string
    public static String rev(String input) {
        if (input == null || input.length() == 0) {
            return "";  // Base case: empty or null string
        }
        // Recursively reverse the rest of the string and append the first character
        return rev(input.substring(1)) + input.charAt(0);
    }
}
