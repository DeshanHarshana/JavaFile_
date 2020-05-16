

public class Abstract_Class_Solutuin {

	public static void main(String[] args) {
		Phone phone;
		phone=new MI();
		display(phone);
		phone=new Motrola();
		display(phone);
		/*
		 * this is also correct
		display(new Motrola());
		display(new MI());
		*/
	}
	static void display(Phone p) {
		p.showdetails();
		
		//good example for runtime polymophism
	}

}

abstract class Phone{
	abstract void showdetails();
}

class Motrola extends Phone{

	
	void showdetails() {
		System.out.println("Motrola 2 GB IOS");
		
	}
	
}
class MI extends Phone{

	
	void showdetails() {
		System.out.println("MI 2GB Lolipop");
	}
	
}