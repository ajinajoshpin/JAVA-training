public class SwapXOR {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 9; // 1001 in binary

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping using XOR
        a = a ^ b; // Step 1: a = a ^ b, a now holds the XOR of original a and b
        b = a ^ b; // Step 2: b = a ^ b, b now holds the original value of a
        a = a ^ b; // Step 3: a = a ^ b, a now holds the original value of b

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
