package com.abs;



public class Abstraction_Example {

	public static void main(String[] args) {
		

	}

}

abstract class MaheshPhone{
	public void call() {
		System.out.println("Calling");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
	public void move() {
		System.out.println("Moving");
	}
	
}

class SureshPhone{
	public void dance() {
		System.out.println("Dance");
	}
	public void cook() {
		System.out.println("Cook");
	}
}

