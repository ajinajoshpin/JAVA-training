import java.util.Scanner;

public class TrailsWithoutFact {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();  // Read the integer 'n'
        ip.close();
    
        int count = 0;
        int i = 5;  // Start with multiples of 5
        
        // Count the number of factors of 5
        while (n / i >= 1) {
            count += n / i;  // Add how many multiples of i are less than or equal to n
            i *= 5;  // Move to the next power of 5
        }
        
        // Print the total count of trailing zeroes
        System.out.println(count);
    }
}
