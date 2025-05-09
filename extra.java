public class extra {
    
    public static void main(String[] args) {
        String s1 = "enna da idhu";
        String s2 = "ennaa da idhu";  // s2 has one extra character

        char result = 0;  // Initialize result with 0 (XOR identity)

        // XOR all characters from s1
        for (char c : s1.toCharArray()) {
            result ^= c; // XOR each character from s1
        }

        // XOR all characters from s2
        for (char c : s2.toCharArray()) {
            result ^= c; // XOR each character from s2
        }

        // The result will be the extra character
        System.out.println("Extra character is: " + result);
    }
}
