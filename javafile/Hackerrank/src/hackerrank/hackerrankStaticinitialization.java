
package hackerrank;

import java.util.Scanner;


public class hackerrankStaticinitialization {
    static int B =0;
    static int H = 0;
    static boolean flag=false;
    static {
        Scanner sn=new Scanner(System.in);
       
        B= sn.nextInt();
        H = sn.nextInt();
        if(B>0 & H>0){
            flag=true;
        }
        else{
            flag=false;
            Exception e=new Exception("Breadth and height must be positive");
            System.out.println(e);
            
        }
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class