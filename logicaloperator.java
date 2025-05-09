import java.util.Scanner;

class logicaloperator {
    public static void main(String args[]) {
        
        boolean hungry = true;        // condition 1: you're hungry
        boolean ice_cream = true;     // condition 2: you have ice cream

        // Using logical AND (&&): both conditions must be true to execute 'eat'
        if (hungry && ice_cream) {
            System.out.print("eat"); // prints 'eat' if both are true
        } else {
            System.out.print("don’t eat"); // prints if either or both are false
        }
    }
}

// You can also try this with || (logical OR) instead of &&
// Example: if(hungry || ice_cream) -> even if one condition is true, it will print 'eat'
