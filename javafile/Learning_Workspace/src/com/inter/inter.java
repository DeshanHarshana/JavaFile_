package com.inter;



public class inter {

	public static void main(String[] args) {
		A obj=new B();
		obj.p();
		
		A obj2=new A() 
		{
				public void p() {
					System.out.println("Shwo");
				}
		};
		obj2.p();
	}

}
interface A{
	void p();
	
		
	
}

class B implements A{
	public void p() {
		show();
	}
	
	public void show() {
		System.out.println("Example");
	}
}

