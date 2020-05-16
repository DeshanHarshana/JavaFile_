
	


public class MultiTreding {

	public static void main(String a[]) throws Exception {
	Runnable obj=new Runnable() {
		
		public void run() {
			
			for(int i=0;i<10;i++) {
			System.out.println("HI");
			try {Thread.sleep(500);} catch(Exception e) {}
			
			
			}
			
			
			}
	};
	
Runnable obj2=new Runnable() {
		
	public void run() { 
		for(int i=0;i<10;i++) {
		System.out.println("Hello");
		try {Thread.sleep(500);} catch(Exception e) {}
		
		
		}
		
	}
	};
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	Thread th1=new Thread(obj);
	Thread th2=new Thread(obj2);
	
	
	th1.start();
	try {Thread.sleep(1);} catch(Exception e) {}
	th2.start();
	th1.join();
	
	System.out.println("Bye");
	}

}
//if we didn't use thread first Hi class execute and then Hello execute
//but now we use thread then two classes are execute synchronize
