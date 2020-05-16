/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.regex.Pattern;

/**
 *
 * @author Deshan
 */
public class JavaRegx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b3 = Pattern.matches("...k", "assk");  
        //4th letter is k
  
        System.out.println(b3);  
        
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
        System.out.println(Pattern.matches("[^amn]", "lbcd"));

// TODO code application logic here
    }
    
}
