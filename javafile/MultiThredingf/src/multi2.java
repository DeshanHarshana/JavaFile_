
public class multi2 {

	public static void main(String[] args) {
	A obj1=new A();
	B obj2=new B();
	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	t1.start();
	t2.start();

	}

}
class A implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class B implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
