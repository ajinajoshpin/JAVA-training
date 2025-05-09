public class FloydsTriangle {

    public FloydsTriangle() {
    }

    public static void main(String[] args) {
        // Number of rows in Floyd's Triangle
        byte numRows = 5;  
        int currentNumber = 1;  // The starting number to print in the triangle

        // Title for better output formatting
        System.out.println("========== Floyd's Triangle ==========");

        // Outer loop for each row
        for (int row = 1; row <= numRows; ++row) {
            // Inner loop for printing numbers in each row
            for (int col = 1; col <= row; ++col) {
                System.out.print(currentNumber + " ");
                ++currentNumber;  // Increment the number to be printed
            }

            // After printing one row, move to the next line
            System.out.println();
        }
    }
}
