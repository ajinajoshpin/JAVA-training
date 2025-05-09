import java.util.*;

public class switchdemo {

    // Method to perform addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public static int sub(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public static int mul(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        // Taking input from user: choice (operation) and numbers
        System.out.println("Enter operation choice (1: Add, 2: Subtract, 3: Multiply, 4: Divide, 5: Exit): ");
        int choice = ip.nextInt(); // operation choice
        System.out.println("Enter two numbers: ");
        int a = ip.nextInt(); // first number
        int b = ip.nextInt(); // second number
        
        // Variable to hold the result
        int result;

        // Exit condition for choice '5'
        if (choice == 5) {
            System.out.println("Exiting Calculator. Goodbye!");
            return;  // exit the program
        }

        // Switch-case to decide the operation based on user's choice
        switch (choice) {
            case 1:  // Addition
                result = add(a, b);
                System.out.println("Result: " + result);
                break;

            case 2:  // Subtraction
                result = sub(a, b);
                System.out.println("Result: " + result);
                break;

            case 3:  // Multiplication
                result = mul(a, b);
                System.out.println("Result: " + result);
                break;

            case 4:  // Division
                if (b != 0) { // To avoid division by zero
                    result = div(a, b);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            default:  // Invalid choice
                System.out.println("Invalid choice. Please select a valid operation.");
                break;
        }
    }
}
