import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 10, 5};

        // Title
        System.out.println("========== Duplicate Element Finder ==========");

        // Using a set to track seen elements
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                // Add the duplicate to the duplicates set
                duplicates.add(arr[i]);
            } else {
                // Add the current element to the seen set
                seen.add(arr[i]);
            }
        }

        // Display duplicates
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate(s) found: " + duplicates);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
