/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscience_examples;

import java.util.Scanner;

/**
 *
 * @author Deshan
 */
public class removealetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String input=sn.nextLine();
        String output="";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='a'){
                continue;
            }
            output=output+input.charAt(i);
        }
        System.out.println(output);
        // TODO code application logic here
    }
    
}
