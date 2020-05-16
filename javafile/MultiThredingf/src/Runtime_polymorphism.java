
public class Runtime_polymorphism {
//compile time polymorphism is method overloading
	public static void main(String[] args) {
		Man m1;
		
		m1=new Man();
		m1.Cloths();
		m1=new Doctor();
		m1.Cloths();
		m1=new Monk();
		m1.eat();
		
		//in this case we only declare one object
		//but it can perform various operation
		//

	}

}

class Man{
	public void Cloths() {
		System.out.println("Man Can ware any cloths");
	}
	public void eat() {
		System.out.println("Eat anything");
	}
}
class Student extends Man{
	public void Cloths() {
		System.out.println("Student only ware School kit");
	}

}
class Doctor extends Man{
	public void Cloths() {
		System.out.println("Doctor only ware doctor cloths");
	}

}
class Monk extends Man{
	public void Cloths() {
		System.out.println("Monk only ware Monk cloths");
	}

}
