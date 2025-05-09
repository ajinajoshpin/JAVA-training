public class sumarrrec {
    public static void main(String[] args) {
        // Command-line input for array
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        // Parse the input from the command-line arguments into an integer array
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        int n = arr.length;
        System.out.println("Sum of array: " + sum(arr, n));
    }

    // Recursive method to calculate the sum of an array
    public static int sum(int arr[], int n) {
        if (n <= 0) return 0; // Base case
        return sum(arr, n - 1) + arr[n - 1];
    }
}
