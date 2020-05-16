
public class Ano_With_interface {

	public static void main(String[] args) {
		abc obj=new abc() {
			public void show() {
				System.out.println("Anonymous class");
			}
		};
		
		obj.show();
	}

}

interface abc{
	void show();
}

/*
class implementor implements abc{

	//we need this class only implement abc interface
	//for that we can use anonymous class
	public void show() {
		System.out.println("Anything");
		
	}
	
}
*/