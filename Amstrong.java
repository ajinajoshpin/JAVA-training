import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Step 1: Read the input number from the user
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.close();

        // Step 2: Store the original number and initialize variables
        int org = n;
        int rem;
        int temp = n;
        int dig = 0;
        int power = 0;

        // Step 3: Find the number of digits in the input number
        while (temp > 0) {
            power++; // Increment digit count
            temp = temp / 10; // Remove the last digit
        }

        // Step 4: Calculate the sum of digits raised to the power of 'number of digits'
        while (n > 0) {
            rem = n % 10; // Extract the last digit
            dig = dig + (int) Math.pow(rem, power); // Add the digit raised to 'power'
            n = n / 10; // Remove the last digit
        }

        // Step 5: Check if the sum equals the original number
        if (org == dig)
            System.out.println("This is an Armstrong number");
        else
            System.out.println("This is not an Armstrong number");
    }
}
