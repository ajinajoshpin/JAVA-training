class strrevusingrec {

    // Recursive function to reverse a string
    static String reverse(String str) {
        if (str.isEmpty()) // Base case: if string is empty, return it
            return str;
        else
            // Recursive case: reverse the substring from index 1 and add the first character at the end
            return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello";
        // Calling the reverse function and printing the result
        System.out.println(reverse(str)); // Output: olleH
    }
}
