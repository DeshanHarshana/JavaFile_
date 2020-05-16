import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		studentDEO deo=new studentDEO();
		Student student=new Student();
		student.name="Deshan";
		student.rollno=15;
		deo.connect();
		
		deo.addStudent(student);
		//student=deo.getStudent(11);
		//System.out.println(student.name);
		
		
				

	}

}

class studentDEO{
	Connection con=null;
	public void connect() throws Exception {
		String url="jdbc:mysql://localhost:3306/deshan";
		String uname="root";
		String pw="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,pw);
	}
	public Student getStudent(int rollno) throws Exception {
		
		String query="select sname from student where rollno="+String.valueOf(rollno);
		Student s=new Student();
		s.rollno=rollno;
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			String name=rs.getString(1);
			s.name=name;
			
		}
		
		return s;
	}
	public void addStudent(Student s) throws Exception {
		String quary="INSERT INTO student VALUES(?, ?)";
		PreparedStatement st=con.prepareStatement(quary);
		st.setInt(1, s.rollno);
		st.setString(2, s.name);
		st.executeUpdate();
	}
}
class Student{
	int rollno;
	String name;
}
