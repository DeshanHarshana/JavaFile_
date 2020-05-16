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
public class Example_Printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
                
                //-15 use to set space after string 15 spaces
                //03 use to containing 3 digit exactly
                //%n use to get new line
            }
            System.out.println("================================");


    }
    
}
