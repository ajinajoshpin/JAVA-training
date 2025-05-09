import java.util.Scanner;

public class Shifting {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt for user
        System.out.print("Enter a number to shift: ");
        int in = scanner.nextInt();  // User input
        scanner.close();
        
        // Perform left shift (multiply by 2)
        int shift = in << 1;
        
        // Display the result with explanation
        System.out.println("Original number: " + in);
        System.out.println("After left shift by 1 (in << 1): " + shift);
        System.out.println("This is equivalent to multiplying the number by 2.");
    }
}
