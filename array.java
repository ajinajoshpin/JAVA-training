public class Array {
    public static void main(String[] args) {
        // Step 1: Initialize arrays (currently commented out)
        // int[] marks = new int[10]; // Array to store marks for 10 students
        // String[] GBU = new String[4]; // Array to store 4 names
        // GBU[0] = "thala"; // Assign value to the first element in the array
        // System.out.println(GBU[0]); // Print the first element of the array
        // System.out.println("num of char is " + GBU.length); // Get the length of the array

        // Step 2: Initialize a simple integer variable and pass to the method
        int age = 24;
        inc(age); // Pass the variable to the method 'inc'

        // Step 3: Print the value of age (no change since primitives are passed by value)
        System.out.println("age 2: " + age);
    }

    // Step 4: Method to increment age (this will not affect the original age in main)
    public static void inc(int age) {
        age++; // Increment the value of the passed integer
    }
}
