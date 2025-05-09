public class GcdRecursion {

    public static void main(String[] args) {
        int a = 49; // First number
        int b = 35; // Second number
        
        // Title
        System.out.println("========== GCD Calculation Using Recursion ==========");

        // Calling the recursive function and printing the result
        System.out.println("The GCD of " + a + " and " + b + " is: " + recc(a, b));
    }

    // Recursive method to calculate GCD using Euclidean algorithm
    public static int recc(int a, int b) {
        // Base case: when b is 0, return a as the GCD
        if (b == 0) {
            return a;
        }
        
        // Recursive call: GCD of b and remainder of a divided by b
