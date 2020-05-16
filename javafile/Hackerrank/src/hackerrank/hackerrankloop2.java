/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.Scanner;
/**
 *
 * @author Deshan
 */
public class hackerrankloop2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
           int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0;
            for(int j=0; j<n; j++){
                int ss=(int)((Math.pow(2, j))* b);
                s=s+ss;
                System.out.print(s+a+" ");
        }
        
            System.out.println("");
    }
          in.close();
}
}