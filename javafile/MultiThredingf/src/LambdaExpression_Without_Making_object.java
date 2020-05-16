
public class LambdaExpression_Without_Making_object {
	public static void main(String[] args) {
		Thread t1=new Thread(() ->
		{
			for(int i=0; i<10;i++) {
				System.out.println("Hey");
			}
		}
	);
		Thread t2=new Thread(() ->
		{
			for(int i=0; i<10;i++) {
				System.out.println("Hello");
			}
		}
	);
		t1.start();
		t2.start();

	}

}
