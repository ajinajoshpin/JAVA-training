class Ajina {
    public static void main(String[] args) {
        int n = 100;  // First number
        int m = 20;   // Second number
        
        // Title
        System.out.println("========== Comparison Result ==========");
        
        // Compare n and m and print appropriate message
        if (n > m) {
            System.out.println("n (" + n + ") is greater than m (" + m + ")");
        } else if (n < m) {
            System.out.println("n (" + n + ") is less than m (" + m + ")");
        } else {
            System.out.println("n (" + n + ") is equal to m (" + m + ")");
        }
    }
}
