package com.abs;
/*
 * if we have more class include same method names we can extend those all
 * 		to abstract class and we can only need one method for access them. that 
 * 		method accept all sub classes objects
 */


public class PhoneShop {

	public static void main(String[] args) {
		showPhone(new Huwawi());
		
	}
	public static void showPhone(Phones p) {
		
		p.call();
		p.dance();
	}

}
abstract class Zonty extends Phones{
	
	public void call() {
		System.out.println("Sony can call");
	}
	public abstract void dance();
	//we can't make object using abstract class
	
}
class Huwawi extends Phones{
	public void call() {
		System.out.println("Huwawi can call");
	}
	public void dance() {
		System.out.println("Huwawi can dance");
	}
	
}
/*
class Motrola extends Phones{
	if we extend to abstract class we must add all method to it
	we must add to this class call() and dance()
}
*/

abstract class Phones{
	public abstract void call();
	public abstract void dance();
}

class Motrola extends Phones{
	public void call() {
		System.out.println("Huwawi can call");
	}
	public void dance() {
		System.out.println("Huwawi can dance");
	}
	public void cook() {
		//if i mention this method as abstract in phone class all other sub classes
		//		must need cook() method
		System.out.println("Huwawi can cook");
	}
}
