import java.util.Scanner;

public class Cuberoot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = ip.nextInt();  
        
        // Calculate the cube root
        double cubeRoot = Math.cbrt(num);

        // Print the result
        System.out.println("The cube root of " + num + " is " + cubeRoot);
        
        ip.close();  // Close the scanner after use
    }
}
