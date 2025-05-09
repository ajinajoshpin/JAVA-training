import java.util.*;

public class twosum {
    public static void main(String[] args){
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.println("enter number of elements");
        int noOfElements = input.nextInt();

        // Initialize the array to hold the input elements
        int[] list = new int[noOfElements];

        // Loop to take input for each element in the array
        for(int i = 0; i < noOfElements; i++) {
            // Prompt user to enter element at index i+1
            System.out.print("enter element " + (i+1) + " ");
            list[i] = input.nextInt();  // Store the element in the array
        }

        // Ask user for the target sum value
        System.out.println("enter the target value");
        int target = input.nextInt();

        // Loop to check all pairs of elements to find the sum equal to the target
        for(int i = 0; i < noOfElements; i++) {
            // Check if the current element is smaller than the target
            if (list[i] < target) {
                // Inner loop to compare the current element with the rest of the array
                for(int j = 0; j < noOfElements; j++) {
                    // Ensure the same element is not added to itself
                    if(i != j && list[i] + list[j] == target) {
                        // Print the pair of numbers that sum up to the target
                        System.out.println("target " + target + " got by summing " + list[i] + " and " + list[j]);
                        return;  // Exit the function once the pair is found
                    }
                }
            }
        }
    }
}
