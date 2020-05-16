class MakeStudent{
	public static void main(String args[]){
		Student student;
		String stdName, stdEmail;
		
		student=new Student();
		student.setName("Deshan");
		student.setEmail("nawarathnadeshan@gmail.com");
		
		stdName=student.getName();
		stdEmail=student.getEmail();
		
		System.out.println("Student Name : " + stdName + ", A Student Email Address : " + stdEmail);
		
		
		
	}
}