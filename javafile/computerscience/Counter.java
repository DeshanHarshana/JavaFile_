class Counter{
	int count;
	void print(){
		System.out.println(count);
	}
	void up(){
		count++;
	}
	void down(){
		count--;
	}
} 

class Example{
	public static void main(String args[]){
		Counter c=new Counter();
		c.print();
		c.up();
		c.print();
		c.down();
		c.down();
		c.print();
	}
}