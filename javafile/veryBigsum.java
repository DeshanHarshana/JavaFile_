import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Solpion {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for(int i=0; i<ar.length; i++){
            sum=sum+ar[i];
        }
        return sum;
    }

    

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int arCount = scanner.nextInt();
        

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }


        long result = aVeryBigSum(ar);

        System.out.println(result);

        
    }
}
