import java.util.Scanner;

public class allone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        //can do mask or right shift

        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) { // check if it is one
                count++;
            }
            num = num >> 1;
        }

        System.out.println("Number of 1's in binary: " + count);
    }
}
