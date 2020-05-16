public class HelloWorld
{
 int t = 90;

public static void main(String args[]) { 
int t = 70;
A a1 = new A(t); 
t = t + 100;
System.out.println(a1.x); 
} 
}
class A{
	int t = 10;
	int x=0;
 
		A(int t) { 
			this.t = 30; 
			t = t + 20;
			this.x=t;
		} 
}