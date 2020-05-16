
package computerscience_examples;

import java.util.Scanner;


public class numberReverse {
    public static void patternA(int size){
        int i,j,k;
        for(i=0; i<size; i++){
            for(j=size; j>i; j--){
                System.out.print(" ");
            }
            if(i==0){
                System.out.println(1);
            }
            for(k=1; k<((2*i)-1); k++){
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
    public static void patternB(int size){
        for(int i=1; i<=size; i++  ){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void patternC(int size){
        for(int i=0; i<size; i++){
            for(int j=size; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<((2*i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternD(int size){
        for(int i=0; i<size; i++){
            for(int j=size; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        patternD(5);
    }
}