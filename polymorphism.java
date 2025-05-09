public class polymorphism {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        // Method call with double type arguments
        double output = calc((double)n1 , (double)n2);

        System.out.println(calc(n1, n2)); // Calls method with 2 int parameters. Output: 15
        System.out.println(calc(n1));     // Calls method with 1 int parameter. Output: 100
        System.out.println(output);       // Calls method with 2 double parameters. Output: 50.0
    }

    // Method with 2 int parameters
    public static int calc(int a, int b) {
        return a + b; // Adds two integers
    }

    // Method with 1 int parameter
    public static int calc(int a) {
        return a * a; // Squares the integer
    }

    // Method with 2 double parameters
    public static double calc(double a, double b) {
        return a * b; // Multiplies two doubles
    }
}
