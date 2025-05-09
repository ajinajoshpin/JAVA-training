public class LoopRec {

    public static void main(String[] args) {
        // Title for clarity
        System.out.println("========== Loop and Recursion Example ==========");
        
        // Loop output
        System.out.println("Using For Loop:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n"); // New line after loop output

        // Recursion output
        System.out.println("Using Recursion:");
        hund(1);
    }

    // Recursive method to print numbers from 1 to 100
    public static void hund(int count) {
        if (count > 100)
            return;

        System.out.print(count + " ");
        hund(count + 1); // Recursive call
    }
}
