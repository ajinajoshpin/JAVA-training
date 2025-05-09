import java.util.Scanner;

public class permu {
    public static void permute(String str,String prefix){
        if (str.length() == 0) {
            System.out.println(prefix); // Base case: one full permutation
            return;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            permute(rem,prefix+c);
            
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scan.nextLine();
        permute(input, "");
    }
}
