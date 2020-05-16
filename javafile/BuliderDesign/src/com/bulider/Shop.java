package com.bulider;

public class Shop {

	public static void main(String[] args) {
		Phonebulider phonebulider=new Phonebulider();
		Phone phone=phonebulider.setBattry(44).setRam(44).getPhone();
		System.out.println(phone);

	}

}
