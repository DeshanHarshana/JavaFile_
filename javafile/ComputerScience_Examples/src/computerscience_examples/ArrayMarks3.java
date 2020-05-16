
package computerscience_examples;


class Student{
	public String ID;
	private String courseIds[] = {"CSC101S3", "CSC102S2", "CSC103S3", "CSC104S3"};
	private double marks[] = new double[4];
	public double average;
	static String grade;
        String checkString;

	public Student(String id){
		ID = id;
	}
       

	public void setMarks(String cid, double m){
		checkString=cid;
		for(int i=0;i<courseIds.length;i++){
                       if(courseIds[i].equals(cid)){
                          
                           
                                
				marks[i]=m;
                               
			}
                       
                        
                        
                       
                }
               
                
                
                
	}

	public void ave(double [] m){
		double sum=0;
		for(int i=0; i<m.length; i++){
			sum=sum+m[i];
		}
		average=sum/(m.length);
	}

	public void print(){
                
		System.out.println("Reg. no.:" + ID);
		ave(marks);
		for(int i=0;i<courseIds.length;i++){
			grade(marks[i]);
			System.out.println("\t" + courseIds[i] + ":" + marks[i] +  "\t" + grade );
		}
                System.out.println("Average is : " + average + "\n");
	}

	static void grade(double m){
		if(m>0 & m <=45){
			grade="W";
		}
		else if(m>45 & m <=55){
			grade="S";
		}
		else if(m>55 & m <=65){
			grade="C";
		}
		else if(m>65 & m <=75){
			grade="B";
		}
		else if(m>75 & m <=100){
			grade="A";
		}
		
	}
}

public class ArrayMarks3{
    static void print(Student[] s){
       
	              
	      for(int i=0;i<s.length; i++){
                  int index = i;  
	            for (int j = i + 1; j < s.length; j++){  
	                if (s[j].average < s[index].average){  
	                    index = j;//searching for lowest index  
	                }  
	                s[j].print();
              }  
			
	}
    
    }
	public static void main(String a[]){
		Student students[] = new Student[2];
		students[0] = new Student("2018/SP/001");
		students[0].setMarks("CSC101S3", 56);
		students[0].setMarks("CSC102S2", 65);
		students[0].setMarks("CSC103S3", 78);
		students[0].setMarks("CSC104S3", 90);
		
		students[1] = new Student("2018/SP/002");
		students[1].setMarks("CSC101S3", 32);
		students[1].setMarks("CSC102S2", 45);
		students[1].setMarks("CSC103S3", 34);
		students[1].setMarks("CSC104S3", 78);

		print(students);
                
                
                
        }
	}



   