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
public class forloopexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for(int i=1; i<=4; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        */
        /*
        int rows=5;
        for(int i=0; i<=rows; i++){
            for(int k=rows; i<k; k--){
                System.out.print(" ");
            }
            for(int j=0; j<((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*
        int rows=3;
        for(int i=0; i<=rows; i++){
            for(int k=rows; i<k; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        */
        
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter list size : ");
        double size=sn.nextInt();
        double min=0;
        double max=0;
        double total=0;
        double average=0;
        System.out.println("Enter Numbers : \n");
        for(int i=0; i<size; i++){
            
            
            int num=sn.nextInt();
            
            
            if(num>=max){
                max=num;
                
                
            }
            if(min<=0 | num<=min){
                
                min=num;
                
            }
            total=total+num;
            
            
        }
        average=total/size;
        System.out.println("Max Number : "+ max);
        System.out.println("Min Number : "+ min);
        System.out.println("Average : "+ average);
        
        /*
        int n1=0,n2=1,n3,i,count=10, n4=0;    
          
    
        for(i=2;i<count;++i)   
        {    
            n3=n1+n2;    
            n4=n3;
            n1=n2;    
            n2=n3;    
 }    
        System.out.println(n4);
  */
        
}}  
    
    

