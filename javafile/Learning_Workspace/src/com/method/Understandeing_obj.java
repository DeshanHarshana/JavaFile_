package com.method;

public class Understandeing_obj {

	public static void main(String[] args) {
		A a=new B();
		a.exe();

	}

}
class A{
	public void exe() {
		System.out.println("I'm in class A");
	}
	
}
class B extends A{
	public void exe() {
		System.out.println("I'm in class B");
	}
}

