import java.util.Scanner;

public class Pelindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String backword="";
       
        for(int i=0; i<A.length(); i++) {
        	backword=backword+A.charAt(A.length()-i-1);
        }
        System.out.println(backword);
	}

}
