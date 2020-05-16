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
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arrayname=new int[3];
        arrayname[0]=13;
        
        
        int a[][]={
                        {1,2,3,5},
                        {5,6,7,6},
                        {8,9,5,7},
                        {5,9,8,8}
                   };
        
        int b[][]={
                        {1,2,3},
                        {5,6,7},
                        {8,9,5},
                        {5,7,6}
        };
                        {
                   };
        
        if(a[0].length==b.length){
           int c[][]=new int[a.length][b[0].length]; 
            
            for(int i=0; i<a.length; i++){
                for(int j=0; j<c[0].length; j++){
                    c[i][j]=0;
                    for(int k=0; k<b.length; k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            
        }
        else{
            System.out.println("This matrics can't multiplye");
        }
        //number of c matrix coloumn = j
        //number of b matrix rows = k
        //number of a matrix rows = i
        
        
    }
    
}
