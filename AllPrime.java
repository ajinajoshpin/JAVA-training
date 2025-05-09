import java.util.Scanner;

public class AllPrime // Step 1: Define the class to handle prime number logic
{
    public static void main(String[] args) {
        // Step 2: Create Scanner object to read user input
        Scanner ip = new Scanner(System.in);

        // Step 3: Read the upper limit from user
        int r = ip.nextInt();

        // Step 4: Create a boolean array to mark prime numbers
        boolean[] isPrime = new boolean[r + 1];

        // Step 5: Initialize all numbers from 2 to r-1 as potentially prime
        for (int i = 2; i < r; i++) {
            isPrime[i] = true;
        }

        // Step 6: Apply Sieve of Eratosthenes
        // Loop through numbers from 2 to sqrt(r)
        for (int j = 2; j * j < r; j++) {
            if (isPrime[j]) {
                // Step 7: Mark all multiples of j as not prime
                for (int k = j * j; k <= r; k += j) {
                    isPrime[k] = false;
                }
            }
        }

        // Step 8: Print all numbers that are still marked as prime
        for (int i = 2; i <= r; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        // Step 9: Close the scanner object
        ip.close();
    }
}

// This program finds and prints all prime numbers from 1 to n using the Sieve of Eratosthenes algorithm.
