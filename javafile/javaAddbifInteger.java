import java.math.BigInteger;
import java.util.Scanner; 
  
class GF { 
    public static void main(String[] args) 
    { 
        Scanner sn=new Scanner(System.in);
        // BigInteger object to store result 
        BigInteger sum;
        BigInteger multi; 
  
        // For user input 
        // Use Scanner or BufferedReader 
  
        // Two objects of String created 
        // Holds the values to calculate the sum 
        String input1 =sn.nextLine();
            
        String input2 
            = sn.nextLine(); 
  
        // Convert the string input to BigInteger 
        BigInteger a 
            = new BigInteger(input1); 
        BigInteger b 
            = new BigInteger(input2); 
  
        // Using add() method 
        sum = a.add(b);
        multi=a.multiply(b);
  
        // Display the result in BigInteger 
        System.out.println(sum); 
        System.out.println(multi); 
    } 
} 