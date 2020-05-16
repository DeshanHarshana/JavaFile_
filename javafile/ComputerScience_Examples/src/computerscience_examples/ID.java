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
public class ID {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean male,female;
        String idnum=s.next();
        int Id[]=new int[idnum.length()+1];
        for(int i=0; i<idnum.length(); i++){
            Id[i]=Character.getNumericValue(idnum.charAt(i));
        }
        int checknum,days,month,year;
        
        
        
        
        
        
    }
    
    
    
    
}
