import java.util.*;

public class commonprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Get number of strings
        sc.nextLine(); // Consume the newline after number input

        String[] strs = new String[n]; // Create an array to store the strings

        // Read all strings from user
        for (int i = 0; i < n; i++) 
            strs[i] = sc.nextLine();

        String prefix = strs[0]; // Start by assuming first string is the prefix

        // Compare with every other string
        for (int i = 1; i < n; i++) {
            // While the current string does not start with the prefix,
            // keep reducing the prefix by one character from the end
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // trim one char
                if (prefix.isEmpty()) break; // stop if prefix becomes empty
            }
        }

        System.out.println("Common Prefix: " + prefix); // Print the result
    }
}
