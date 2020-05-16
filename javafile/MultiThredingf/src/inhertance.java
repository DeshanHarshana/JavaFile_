public class inhertance {

	public static void main(String[] args) {
		A2 a=new A2();
		A2 obj=new C2();
		C2 obj2=new C2();

		// we can't call only C2 class method obj.xx() we can't call
		//purpose of calling like this is override parent class method
		//we can use override method in C2
		//java can't call grant parent only call it's super class using super keyword

		obj.move();
		obj.print();
		
		
		
	}

}

class A2{
	public void move() {
		System.out.println("A moving...");
	}
	public void print(){
		System.out.println("Printing");
	}
	
}
class B2 extends A2{
	public void move() {
		
		System.out.println("B moving...");
	}
}

class C2 extends B2{
	public void move() {
		super.move();
		System.out.println("c moving...");
	}
	public void xx() {
		System.out.println("Round..");
	}
}

