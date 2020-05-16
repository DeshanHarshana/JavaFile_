package com.method;

public class Anonimusobj {

	public static void main(String[] args) {
		X obj=new X();
		obj.k=5;
		obj.setK();
		
		new X().k=56;//Anonymous object
		new X().setK();//anonymous object 
		
		/*
		 *anonymous object create only in heap memory 
		 *if we use object only once the eligible way is make a anonymous object
		 *
		 */

	}

}
class X{
	int k;
	public void setK() {
		
		System.out.println(k);
		
	}
}
