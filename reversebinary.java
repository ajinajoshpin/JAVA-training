public class revbin {
    public static void main(String[] args) {
        int org = 10; // original decimal number

        StringBuilder res = new StringBuilder(); // to store reversed binary

        int a = org;

        // Convert the number to binary and reverse it by appending LSB (least significant bit) first
        while (a > 0) {
            int last = a & 1; // get the last bit using bitwise AND
            res.append(last); // add it to the result
            a = a >> 1; // right shift to remove the last bit
        }

        System.out.println("Original decimal: " + org);
        System.out.println("Binary (normal): " + Integer.toBinaryString(org)); // built-in binary string
        System.out.println("Reversed Binary: " + res); // reversed binary string

        // Convert the reversed binary string back to decimal
        int num = Integer.parseInt(res.toString(), 2);
        System.out.println("Decimal after reversing binary: " + num);
    }
}
