
package computerscience_examples;

class student{
	String name;
	double marks;
        int x=0;
	String grade;
	student(String n, double m){
		name=n;
		marks=m;
	}
	public void print(){
		grade(marks);
		System.out.println("Name : " + name + "\t\tMarks : " + marks + "\t\tGrade : " + grade);
	}
	public void addMarks(double m){
		
		marks+=m;
		if(marks>=100){
			marks=100;
		}
	}

	public void grade(double m){
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

public class ArrayMarks2{
	public static void main(String a[]){
		student st []=new student[6];
		st[0]=new student("Raja",89);
		st[1]=new student("David",55);
		st[2]=new student("Deshan",76);
		st[3]=new student("Harshana",70);
		st[4]=new student("Samudika",77);
		print(st);
		st[0].addMarks(20);
		st[2].addMarks(5);
		st[1].addMarks(20);
		System.out.println("\nAFTER CHANGING\n");
		print(st);
	}
	static void print(student [] s){
		for(int i=0; i<s.length; i++){
			s[i].print();
		}
	}
}