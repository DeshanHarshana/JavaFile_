import java.util.Scanner;

public class StringExe1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)<0){
            System.out.println("No");
        }
        
        String A1 = A.substring(0, 1).toUpperCase()+A.substring(1);
        String B1 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A1+" "+B1);
	}

}
