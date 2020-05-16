import java.util.Scanner;

public class Pattern1{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		double cel, fah;
		System.out.print("Enter Celcious Value");
		cel=in.nextDouble();
		fah=((9*cel)/5)+32;
		System.out.println("fahrenheit : " + fah);
	}
}