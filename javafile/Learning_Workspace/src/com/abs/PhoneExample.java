package com.abs;



public class PhoneExample {
	public static void main(String a[]) {
	Iphone phone=new Iphone();
	phone.showConfig();
	
	Samsung phone2=new Samsung();
	phone2.showConfig();
	
	
	
	}
	/*
	 * if we don't have a abstract class we need two method like this
	 * we need two method for accept Iphone and Samsung object
	 * But if we make a Phone class and extends Iphone and Samsung class to phone
	 * class we don't need two method like this. because we can pass object of
	 * iphone and samsung to phone class because it is the abstract super class
	 * of iphone and samsung. 
	public static void show(Iphone p) {
		p.showConfig();
	}
	
	public static void show(Samsung p) {
		p.showConfig();
	}
	*/
	public static void show(Phone p) {
		//this is accept all object which iphone and samsung
		p.showConfig();
}
}

abstract class Phone{
	
	public abstract void showConfig();
}

class Iphone extends Phone{
	public void showConfig() {
		System.out.println("This is a Iphone");
	}
}
class Samsung extends Phone{
	public void showConfig() {
		System.out.println("This is a Samsung");
	}
}
