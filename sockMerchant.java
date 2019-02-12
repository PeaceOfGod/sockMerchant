import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        for(int i=0; i<n; i++){
            if (ar[i] == 0){
                continue;
            }
            for(int j=i+1; j<n; j++){
                if(ar[i] == ar[j]){
                    count++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
    return count;
    }
    
    //Private static Method
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //Initializing and Creating of an Array of n INTEGERS
        int[] ar = new int[n];

        //Passing a function to split into new lines strings that would be entered
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Adding the each elements in arItem to ar after casting the string to integer 
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        //Calling the sockMerchant method
        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
