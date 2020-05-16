

public class Abstract_Class_Problem {

	public static void main(String[] args) {
		Iphone iphone=new Iphone();
		Samsung samsung=new Samsung();
		showIphone(iphone);
		showSamsung(samsung);
		
		// but why we need two method
		//this is the problem
		//this problem can solve using abstract class

	}
	public static void showIphone(Iphone i) {
		i.showConfig();
	}
	public static void showSamsung(Samsung i) {
		i.showConfig();
	}

}

class Iphone {
	void showConfig() {
		System.out.println("2gb, IOS");
	}
}
class Samsung {
	void showConfig() {
		System.out.println("2gb, Lolipop");
	}
}
