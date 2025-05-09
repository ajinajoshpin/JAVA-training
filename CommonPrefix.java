import java.util.*;

public class CommonPrefix {
    public static void main(String[] args) {
        // Initialize Scanner to read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of strings
        sc.nextLine(); // Consume the remaining newline character

        // Initialize an array to store the input strings
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine(); // Read each string
        }

        // Assume the first string is the common prefix initially
        String prefix = strs[0];

        // Loop through all strings to find the common prefix
        for (int i = 1; i < n; i++) {
            // While the current string does not start with the prefix, reduce the prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix by 1 character
                if (prefix.isEmpty()) break; // If the prefix becomes empty, no common prefix exists
            }
        }

        // Print the result (the common prefix)
        System.out.println("Common Prefix: " + prefix);
    }
}
