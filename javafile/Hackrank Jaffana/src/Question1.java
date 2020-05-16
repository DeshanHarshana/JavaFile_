import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int boxes[]=new int[size];
		for(int i=0; i<size; i++) {
			boxes[i]=scanner.nextInt();
		}
		int diffent=0;
		int x=0;
		for(int i=0; i< boxes.length; i++) {
			diffent=boxes[i]/5;
			x=diffent*5;
			if(boxes[i]-x>=3) {
				boxes[i]=(diffent*5)+5;
			}
			else{
				boxes[i]=(diffent*5);
			}
		}
		for(int i : boxes) {
			System.out.println(i);
		}
		

	}

}
