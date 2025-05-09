import java.util.Scanner;

public class MultiplyWithoutMultiply {

    public static void main(String[] args) {
        // Title for clarity in output
        System.out.println("========== Multiplication Without Using '*' ==========");

        // Scanner to take input from user
        Scanner ip = new Scanner(System.in);
        
        // Input prompts
        System.out.print("Enter first number: ");
        int a = ip.nextInt();
        System.out.print("Enter second number: ");
        int b = ip.nextInt();
        
        // If either number is 0, product will be 0
        if (a == 0 || b == 0) {
            System.out.println("Product: 0");
            ip.close();
            return;
        }
        
        int result = 0;

        // Loop for repeated addition (absolute value of b)
        for (int i = 0; i < Math
