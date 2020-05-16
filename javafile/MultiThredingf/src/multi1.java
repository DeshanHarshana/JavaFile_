
public class multi1 {

	public static void main(String[] args) {
		Hello obj1=new Hello();
		Hi obj2=new Hi();
		
		obj1.start();
		obj2.start();
	}

}

class Hello extends Thread{
	public void calc() {
	 String xString="";
	 long x=System.currentTimeMillis();
		for(int i=0; i<100000000; i++) {
			xString=xString+"*";
		}
		long y=System.currentTimeMillis();
		System.out.println(y-x);
	}
	public void run() {
		
		calc();
	}
}

class Hi extends Thread{
	public void run() {
		calc();
		}
	
	public void calc() {
		 String xString="";
		 long x=System.currentTimeMillis();
			for(int i=0; i<100; i++) {
				xString=xString+"*";
			}
			long y=System.currentTimeMillis();
			System.out.println(y-x);
		}
	
	
}


