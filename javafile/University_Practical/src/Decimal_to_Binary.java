import java.util.Scanner;
public class Decimal_to_Binary {
	public static void toBinary(int decimal){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index] = decimal%2;    
	       decimal = decimal/2;    
	       index++;
	     }    
	     for(int i=0; i<index; i++) {
	    	 System.out.print(binary[(index-1)-i]);
	     }
	System.out.println();//new line  
	}    

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Deciml value ");
		int input=scanner.nextInt();
		toBinary(input);
		

	}

}

