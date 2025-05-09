import java.util.Scanner;

public class CountonesInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt(); // read the decimal number from user

        int count = 0; // to count number of 1's in binary

        // Loop runs until num becomes 0
        while (num > 0) {
            if ((num & 1) == 1) { // check if last bit is 1 using bitwise AND
                count++; // increment count if 1 is found
            }
            num = num >> 1; // right shift the number by 1 bit (remove last bit)
        }

        System.out.println("Number of 1's in binary: " + count); // display the count
    }
}
