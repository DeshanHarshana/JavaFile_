
public  class Syncrenition {

	public static void main(String[] args) throws InterruptedException {
	Count count=new Count();
	
	Thread t1=new Thread(new Runnable() 
	{
		public void run() {
		for(int i=0; i<100000; i++) {
			count.increment();
		}
		}
	});
	Thread t2=new Thread(new Runnable() 
	{
		public void run() {
		for(int i=0; i<100000; i++) {
			count.increment();
		}
		}
	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(count.count);

	}

}

class Count{
	int count=0;
	synchronized void increment() {
		count++;
	}
}
