
public class Anonimus {

	public static void main(String[] args) {
		A1 obj=new A1() {
			public void show() {
				System.out.println("I Am class B");
			}
		};
		obj.show();
	}

}
class A1{
	public void show() {
		System.out.println("I Am class A");
	}
}

/*
class B1 extends A1{
	public void show() {
		System.out.println("I Am class B");
	}
}

instead of using another class for override A1 class
we can use anonymous class

*/