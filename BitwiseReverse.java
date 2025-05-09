public class BitwiseReverse {
    public static void main(String[] args) {
        // Initialize num and output variables
        int num = 0; // Number to reverse (currently 0)
        int output = 0; // Variable to store the reversed output

        // Iterate through 32 bits (assuming 32-bit integer)
        for (int i = 0; i < 32; i++) {
            // Extract the last bit of num
            int last = num & 1; // Perform bitwise AND to get the least significant bit

            // Shift output left if it's not 0
            if (output != 0) {
                output = output << 1; // Left shift the output by 1 bit
            }

            // If the last bit was 1, set the least significant bit of output to 1
            if (last == 1) {
                output = output | 1; // Perform bitwise OR to set the last bit
            }

            // Shift num right to process the next bit
            num = num >> 1; // Right shift num by 1 bit to process the next bit
        }

        // Print the final reversed output
        System.out.println(output); // Output the reversed number
    }
}
