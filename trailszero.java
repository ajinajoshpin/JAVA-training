import java.math.BigInteger;
import java.util.Scanner;

public class trailszero {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner ip = new Scanner(System.in);
        
        // Read the input value for n
        int n = ip.nextInt();
        
        // Close the scanner after use
        ip.close();
        
        // Initialize BigInteger 'fact' to 1 (as BigInteger cannot hold simple integer values)
        BigInteger fact = BigInteger.ONE;
        
        // Calculate the factorial of 'n' using a for loop
        for (int i = 1; i <= n; i++) {
            // Multiply the current value of 'fact' by i
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        // Print the calculated factorial
        System.out.print(fact);
        
        // Initialize count for trailing zeros
        int count = 0;

        // Check the number of trailing zeros by dividing 'fact' by 10 until the remainder is not zero
        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            // Increment the count for each trailing zero
            count++;
            
            // Remove the last digit (divide by 10)
            fact = fact.divide(BigInteger.TEN);
        }

        // Print a new line
        System.out.print("\n");

        // Print the count of trailing zeros
        System.out.print(count);
    }
}
