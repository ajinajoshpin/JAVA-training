import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        // Input prompt for clarity
        System.out.print("Enter a number to check if it's a perfect number: ");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();  // User input
        sc.close();

        // Check for valid positive input
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0;

        // Loop to calculate the sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == num) {
            System.out.println("The number " + num + " is a perfect number.");
        } else {
            System.out.println("The number " + num + " is not a perfect number.");
        }
    }
}
