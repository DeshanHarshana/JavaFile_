
public class Abstract_Class {

	public static void main(String[] args) {
	MaheshPhone m=new sureshPhone();
	m.call();//this give sureshPhone calling method
	//but if we want to maheshPhone calling method we have to use super.call();
	}

}
abstract class MaheshPhone{
	public void call() {
		System.out.println("Calling...");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
	public void move() {
		System.out.println("Moving...");
	}
}

class sureshPhone extends RameshPhone{
	public void call() {
		super.call();
		System.out.println("Calling.. Suresh");
	}
	public void dance() {
		System.out.println("Dancing...");
	}
	public void cook() {
		System.out.println("Cooking...");
	}
}
