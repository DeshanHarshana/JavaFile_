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
public class Pattern {
    public static void main(String args[]){
        /*int n=5;
        int i=0;
        int j=1;
        while(i<n){
            j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            i++;
            System.out.println();
        }
*/
        
        int n=5;
        int i=0;
        int j=1;
        while(i<n){
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
            
        }
    }

    
}
