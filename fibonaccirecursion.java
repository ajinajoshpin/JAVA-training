public class Fiborecursion {
    
    // Fibonacci recursive function
    public static int fib(int n) {
        if (n == 0) return 0; // base case 1
        if (n == 1) return 1; // base case 2
        return fib(n - 1) + fib(n - 2); // recursive calls
    }

    public static void main(String[] args) {
        int n = 10;
        
        // Title
        System.out.println("========== Fibonacci Sequence (Recursive) ==========");
        
        // Display Fibonacci sequence up to n terms
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci of " + i + " is: " + fib(i));
        }
    }
}
