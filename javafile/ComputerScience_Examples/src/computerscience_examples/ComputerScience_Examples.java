
package computerscience_examples;

import java.util.Scanner;

/**
 *
 * @author Deshan
 */
public class ComputerScience_Examples {

    
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter ID Number : ");
        check(sn.next());
        
        
        
        
    }
    
    static void check(String s){
        int checknumber=Integer.parseInt(s.substring(2, 5));
        int days=0;
        if(checknumber>=501 & checknumber <=866){
            
            days= (Integer.parseInt(s.substring(2,5))-500);
        }
        else{
            
            days =(Integer.parseInt(s.substring(2,5)));
        }
        
        int Month=0;
        int date=0;
        
            if(days-31<=0){
                Month=1;
                date=days;
            }
            else if(days-59<=0 && days>31){
                Month=2;
                date=days-31;
            }
            else if(days-90<=0 && days>59){
                Month=3;
                date=days-60;
            }
            else if(days-120<=0 && days>90){
                Month=4;
                date=days-91;
            }
            else if(days-151<=0 && days>120){
                Month=5;
                date=days-121;
            }
            
           else if(days-181<=0 && days>151){
                Month=6;
                date=days-152;
            }
            else if(days-212<=0 && days>181){
                Month=7;
                date=days-182;
            }
            else if(days-243<=0 && days>212){
                Month=8;
                date=days-213;
            }
            else if(days-273<=0 && days>243){
                Month=9;
                date=days-244;
            }
            else if(days-304<=0 && days>273){
                Month=10;
                date=days-274;
            }
            else if(days-334<=0 && days>304){
                Month=11;
                date=days-305;
            }
            
        System.out.println("19"+s.substring(0,2)+"/"+Month+"/"+date);
    }
    }

    
    

