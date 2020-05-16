package Suthakaran;

public class BuilderPattern1 {

	public static void main(String[] args) {
		Student student=new Student().setId(1).setAddress("Colombo");
		System.out.println(student.toString());

	}

}

class Student { 
    private int id=0; 
    private String name="no set"; 
    private String address="no set";; 
  
   
    public Student setId(int id) 
    { 
        this.id = id; 
        return this; 
    } 
  
    public Student setName(String name) 
    { 
        this.name = name; 
        return this; 
    } 
  
    public Student setAddress(String address) 
    { 
        this.address = address; 
        return this; 
    } 
    public String toString() 
    { 
    	
        return "id = " + this.id + ", name = " + this.name +  
                               ", address = " + this.address; 
    
    }
} 