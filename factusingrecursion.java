class factrec {
    // Method to calculate factorial using recursion
    public static int fact(int n) {
        // Base case: if n is 0, return 1 (since 0! = 1)
        if (n == 0) 
            return 1;
        
        // Recursive case: multiply n with factorial of (n-1)
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        // Call the fact method with 2 as input and print the result
        System.out.println(fact(2)); // Output: 2
    }
}
