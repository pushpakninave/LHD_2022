import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter string to be reversed : ");
        //input from user
        String inputString = sc.nextLine();
        String revString = "";
        
        /*naive_Method 1
        
        
        for(int i=0;i<inputString.length();i++){
            revString = inputString.charAt(i) + revString;
        }

        */
        
        
        /*naive_Method 2 using swaps to reduce timecomplexity
        
        char[] inputArray = inputString.toCharArray();
        for (int i = 0; i < inputArray.length && i<inputArray.length-i; i++) {
            char temp = inputArray[i];
            inputArray[i]=inputArray[inputArray.length-i-1];
            inputArray[inputArray.length-i-1] = temp;
        }
        revString = new String(inputArray);
        
        */

        System.out.println("Reversed string: " + revString);
    }
}
