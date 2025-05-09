package Backtracking;
import java.util.*;

public class Backtracking {

    // Method to print all permutations of a given string
    public static void printPermutations(String str, String ans, ArrayList<String> list) {
        // Base case: if the string is empty, add the current permutation to the list
        if (str.isEmpty()) {
            list.add(ans);
        }

        // Loop through each character of the string and make recursive calls
        for (int i = 0; i < str.length(); i++) {
            // Get the character at index i
            String ch = "" + str.charAt(i);

            // Remove the character at index i from the string and get the rest of the string
            String res = str.substring(0, i) + str.substring(i + 1);

            // Recursively call the method to find permutations with the new string and the current character added to the answer
            printPermutations(res, ans + ch, list);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList to store the permutations
        ArrayList<String> list = new ArrayList<>();
        
        // Call the recursive method to generate permutations of the string "abc"
        printPermutations("abc", "", list);

        // Print the list of permutations
        System.out.println(list);
    }
}
