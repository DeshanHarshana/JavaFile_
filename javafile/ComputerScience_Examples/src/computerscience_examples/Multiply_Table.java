/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscience_examples;

/**
 *
 * @author Deshan
 */
public class Multiply_Table {
static int[] first={1,2,3,4,5,6,7,8,9,10};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
        runner(i);
        }
            
        
        
        
           
    }
    public static void runner(int number){
        for(int i=0; i<=9;i++){
            System.out.print("\t");
            System.out.print("|");
            System.out.print(first[i]*number);
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("");
    }
    
}
