package new1;

public class Matrices {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        int[][] matrix = {
            {1, 0, 0},
            {0, 5, 0},
            {0, 0, 9}
        };

        int flag = 0; // Flag to check if the matrix is diagonal

        // Loop through the rows of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Loop through the columns of the matrix
            for (int j = 0; j < matrix[i].length; j++) {
                // Check if we are on the diagonal (i == j)
                if (i == j) {
                    // If the diagonal element is not 0, set the flag
                    if (matrix[i][j] != 0) {
                        flag = 1;
                    }
                }
            }
        }

        // Check the flag value and print if it's a diagonal matrix
        if (flag == 1) {
            System.out.println("It is a diagonal matrix");
        } else {
            System.out.println("It is not a diagonal matrix");
        }
    }
}
