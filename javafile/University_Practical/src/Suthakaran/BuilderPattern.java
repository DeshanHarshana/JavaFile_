package Suthakaran;

class Phone{
	private String os;
	private int ram;
	private String processor;
	private double srceenSize;
	private int battery;
	public Phone(String os, int ram, String processor, double srceenSize, int battery) {
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.srceenSize = srceenSize;
		this.battery = battery;
	}
	
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", srceenSize=" + srceenSize
				+ ", battery=" + battery + "]";
	}
	
	
}

class BuilderPattern{
	public static void main(String [] args) {
		Phone p=new phoneBuilder().setOs("Android").setProcessor("Quard").getPhone();
		System.out.println(p);
	}
}

class phoneBuilder{
	private String os;
	private int ram;
	private String processor;
	private double srceenSize;
	private int battery;
	public phoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public phoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public phoneBuilder setSrceenSize(double srceenSize) {
		this.srceenSize = srceenSize;
		return this;
	}
	public phoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, processor, srceenSize, battery);
	}
	
	
}
