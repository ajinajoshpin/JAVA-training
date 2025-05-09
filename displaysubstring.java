import java.util.*;

public class displaysubstring {
    public static void main(String[] args) {
        String input = "ajinajoshpin";
        List<String> longestSubstrings = getAllLongestSubstrings(input);

        System.out.println("All longest substrings without repetition:");
        for (String s : longestSubstrings) {
            System.out.println(s);
        }
    }

    public static List<String> getAllLongestSubstrings(String input) {
        List<String> result = new ArrayList<>();
        HashMap<Character, Integer> position = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < input.length(); right++) {
            char current = input.charAt(right);

            if (position.containsKey(current)) {
                // Move left pointer if repeat character found
                left = Math.max(left, position.get(current) + 1);
            }

            position.put(current, right);

            int currentLength = right - left + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                result.clear(); // new max found, reset list
                result.add(input.substring(left, right + 1));
            } else if (currentLength == maxLength) {
                result.add(input.substring(left, right + 1));
            }
        }

        return result;
    }
}
