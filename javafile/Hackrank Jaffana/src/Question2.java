import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			test(arr[i]);
		}
		

	}
	static void test(int n) {
		int sum=0;
		for(int i=0; i<n; i++) {
			if(i%3==0) {
				sum=sum+i;
				
			}
			else if(i%5==0) {
				sum=sum+i;
			}
			
			
		}
		System.out.println(sum);
		sum=0;

	}

	

}
