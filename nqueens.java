public class NQueens {

    public static void main(String[] args) {
        int n = 4;  // Size of the board (4x4)
        
        // If n < 4, there is no solution for N-Queens problem
        if (n < 4) {
            System.out.println("No solution exists for N < 4.");
            return;
        }

        int[] queen = new int[n];  // Array to store the column positions of queens for each row
        int row = 0;  // Start placing queens from the first row

        placeMyQueen(queen, row);
    }

    // Recursive method to place queens row by row
    public static void placeMyQueen(int[] queen, int row) {
        // If all queens are placed, print the board and return
        if (row == queen.length) {
            printBoard(queen);  // Print the board layout
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < queen.length; col++) {
            // If placing the queen at (row, col) is safe, place the queen and move to the next row
            if (isSafe(queen, row, col)) {
                queen[row] = col;  // Place the queen in the current column
                placeMyQueen(queen, row + 1);  // Recur for the next row
            }
        }
    }

    // Method to check if placing a queen at (row, col) is safe
    private static boolean isSafe(int[] queen, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if two queens are in the same column
            if (queen[i] == col)
                return false;
            // Check if two queens are on the same diagonal (top-left to bottom-right)
            if ((i - row) == (queen[i] - col))
                return false;
            // Check if two queens are on the same diagonal (top-right to bottom-left)
            if ((i - row) == (col - queen[i]))
                return false;
        }
        return true;
    }

    // Method to print the board in a readable format
    private static void printBoard(int[] queen) {
        System.out.println("Solution:");
        for (int i = 0; i < queen.length; i++) {
            // Print each row, with a 'Q' in the column where the queen is placed
            for (int j = 0; j < queen.length; j++) {
                if (queen[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
