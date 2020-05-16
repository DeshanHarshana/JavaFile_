package com.bulider;

public class Phonebulider {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battry;
	
	public void setOs(String os) {
		this.os = os;
		
	}
	public Phonebulider setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Phonebulider setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public Phonebulider setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public Phonebulider setBattry(int battry) {
		this.battry = battry;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, battry);//return object including setting values
		/*this getPhone() pass all this values as phone object. If we call this function 
		it pass all above values to phone object
		
		suppose if we didn't set value to battry it would pass default value. in this case default value of 
		int is 0.
		
		in this function parameaters use private instances value in this class
		
		above setters set values to that instance variable (setters will pass values when we create PhoneBulider object)
		
		*******we have to call like this***********
		
		Phone phone=new PhoneBulider().setBattry(80).getPhone();
		
		phoneBulider class's setters pass setBattry value=80 and others=0 or null
		to phonebulider class instance varibles
		
		after getPhone method get that value and make phone object
		
		then this getPhone method will pass assign value to phone class constructor
		
		phone class constructure pass those values to phone class instance variables
		
		after toString Method pass all value to string and it will give us phone object incluede
		assign value as string format.
		
		after we can make phone class obect inside main method and we can sout it.
		
		****************other way to make it*********************
		*
		*
		first make PhoneBulider object like this
		PhoneBulider pb=new PhoneBulider().setBattry(78).setOs("Android");
		
		after we can pass this value to phone class constructure to using getPhone() method
		
		Phone phone=pb.getPhone();
		
		
		***********important****************
		*
		*if we make phoneBulider obect like this all values will be null because we didin't use any setters
		*Phonebulider phonebulider=new Phonebulider();
		*
		*we can't make public void setOs(String os){}
		*because firstly we make phoneBulider object then we can't make phoneBulider object calling
		*setOs we have to make return type as PhoneBulider
		*therefore we create public PhoneBulider setOs(String os){}
		*/
	}
	
	
}
