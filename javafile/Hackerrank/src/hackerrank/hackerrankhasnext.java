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
public class hackerrankhasnext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int count=1;
       while(s.hasNext()){
           System.out.println(count + " " + s.nextLine());
           count++;
       }
    }
    
}
