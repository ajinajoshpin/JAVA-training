import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,24,63};

        int a = 53;
        int n = arr.length;
        int[] arra = new int[n+1];
        int i=0;

        while(i <n && arr[i]< a)
        {
            arra[i] = arr[i];
            i++;
        }

        arra[i] = a;

        for( int j =i ; j< n ; j++)
        {
            arra[j+1] = arr[j];
        }

         System.out.println("Sorted array: " + Arrays.toString(arra));




    }
    
}
