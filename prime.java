import java.util.Scanner;

class Prime {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;  // If divisible, it's not prime
        }
        return true;  // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt for user
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();  // User input
        scanner.close();

        // Checking if the entered number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
