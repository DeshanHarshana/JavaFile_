class Student{
	String name;
	int age;
	String color;
	String sex;
	//Adding additional fields
	String nicNo;
	String address;
	String mobileNo;
	

}

class TestStudent{

	public static void main(String args[]){
		Student s=new Student();
		
		s.name="Deshan Harshana";
		s.age = 22;
		s.color="Blue";
		s.sex="Male";
		
		s.nicNo="972890480V";
		s.address="Penalikadawara, Moragane";
		s.mobileNo="0775058313";
		
		System.out.println("Name : "+s.name);
		System.out.println("Age : "+s.age);
		System.out.println("Color : "+s.color);
		System.out.println("Sex : "+s.sex);
		
		System.out.println("NIC No : "+s.nicNo);
		System.out.println("Address : "+s.address);
		System.out.println("Mobile Number : "+s.mobileNo);
		}
}