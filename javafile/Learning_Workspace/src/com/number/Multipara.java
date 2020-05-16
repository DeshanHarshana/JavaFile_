package com.number;

public class Multipara {

	public static void main(String[] args) {
		A obj=new A();
		obj.p(6,7,8,45,6,"two",6.78);

	}

}
class A{
	public void p(Object... val) {
		for(Object c : val) {
			
			System.out.println(c);
		}
	}
}
