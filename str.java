public class str {
    public static void main(String[] args) {
        // Initializing string variables
        String name = "Sanj";
        String emp = "Sanj";
        
        // Shallow comparison using '=='
        // Both 'name' and 'emp' are pointing to the same string literal in the String pool, so they have the same address.
        System.out.println(name == emp); // true, as both point to the same memory location (String pool)

        // Creating a new String object explicitly
        String tenant = new String("Sanj");
        
        System.out.println("Shallow");
        // Shallow comparison using '=='
        // The 'tenant' string is created using the 'new' keyword, so it has a different memory address.
        System.out.println(name == tenant); // false, as 'name' and 'tenant' refer to different memory locations

        System.out.println("Deep");
        // Deep comparison using '.equals()' method
        // The .equals() method compares the contents of the strings, not their memory addresses.
        System.out.println(name.equals(tenant)); // true, since the content ("Sanj") is the same

        // Explanation:
        // - **Shallow comparison** ('==') checks whether two references point to the same memory location.
        // - **Deep comparison** (.equals()) checks whether the actual contents of the objects are equal.

        // In Java, strings are stored in the string pool. When you create a string using the string literal, it refers to the string pool.
        // When you create a new string using 'new String()', it creates a new object in memory, which is why '==' will return false.
    }
}
