public class CubeBinary {
    public static void main(String[] args) {
        int num = 28; // Number whose cube root is to be calculated
        int root = 3; // The root to find (cube root in this case)
        double left = 0; // Left boundary for the binary search
        double right = num; // Right boundary for the binary search
        double middle = 0; // Variable to store the middle value during binary search
        double error = 0.000000001; // Precision error tolerance for binary search

        // Call the multiply method (not used in this case, but it's part of the calculation)
        multiply(num, root);

        // Perform binary search to find the cube root within error tolerance
        while ((right - left) > error) {
            middle = (left + right) / 2; // Find the middle value between left and right
            // If the current middle value raised to the power of root is greater than num, adjust the right boundary
            if (multiply(middle, root) > num) {
                right = middle;
            } else {
                // Otherwise, adjust the left boundary
                left = middle;
            }
        }

        // Print the approximate cube root of num
        System.out.println(middle);
    }

    // Method to multiply a number by itself 'root' times (used to calculate powers)
    public static double multiply(double num, double root) {
        double multvalue = 1; // Initialize multiplication value to 1
        // Loop 'root' times to multiply the number by itself
        for (int i = 0; i < root; i++) {
            multvalue = multvalue * num;
        }
        return multvalue; // Return the calculated value
    }
}
