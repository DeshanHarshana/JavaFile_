
package computerscience_examples;

import java.nio.file.Files;

public class Palindromes {
    

    
    
    

    public static void main(String[] args) {
        NewClass cslass=new NewClass() {
            @Override
            void write(String s) {
                System.out.println("llll");//To change body of generated methods, choose Tools | Templates.
            }
        };
        cslass.write("dfdfa");
        
        String first="Star";
        String second="Rats";
        String firstReverse="";
        
        
        for(int i=0; i<first.length(); i++ ){
            char l=first.charAt(first.length()-(1+i));
            firstReverse +=l;
        }
        String a=second.toLowerCase();
        String b=firstReverse.toLowerCase();
        
       
        
        if(a.contains(b)){
            System.out.println("First And Second Words are Palindromes");
        }
        else{
            System.out.println("First And Second Words are not Palindromes");
        }
    }
    
}
