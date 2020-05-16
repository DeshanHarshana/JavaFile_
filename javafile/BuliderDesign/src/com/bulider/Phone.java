package com.bulider;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battry;
	
	
	public Phone(String os, int ram, String processor, double screenSize, int battry) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battry = battry;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battry=" + battry + "]";
	}


	
	}
	
	
	
	
	
	
	
	
	
	


