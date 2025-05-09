import java.util.Scanner;

public class vary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding command line input to get the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        inc(age);
        
        // Display the age after calling the inc() method
        System.out.println("age 2: " + age);

        scanner.close();
    }

    public static void inc(int age) {
        age++;
        System.out.println("age 1: " + age);
    }
}
