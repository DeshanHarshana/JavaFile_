
public class Java_Interface {

	public static void main(String[] args) {
	A obj=new X();
	A a=new A(){
	
		
		public void show() {
			System.out.println("anonymous inner type");
		}
	};
	a.show();

	}

}

interface A{
	void show();
}
class X implements A{
	public void show() {
		
	}
	public void display() {
		
	}
}