import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        // Title
        System.out.println("========== Factorial Calculator ==========");
        
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        // Initialize BigInteger values
        BigInteger num = BigInteger.valueOf(input);
        BigInteger fact = BigInteger.ONE;

        // Calculate factorial using BigInteger
        for (int i = 1; i <= input; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        // Display the result
        System.out.println("Factorial of " + input + " is: " + fact);
    }
}
