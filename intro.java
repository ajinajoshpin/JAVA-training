public class sumofnatusingrec {
    // Recursive method to calculate sum of first n natural numbers
    public static int sumnat(int n) {
        if (n == 0) return 0;  // Base case: when n is 0, return 0
        return n + sumnat(n - 1);  // Recursive call: add n and the sum of numbers from n-1
    }

    public static void main(String[] args) {
        int n = 5;  // Define the number 'n' for which we want the sum of first 'n' natural numbers
        System.out.println(sumnat(n));  // Call the recursive method and print the result
    }
}
