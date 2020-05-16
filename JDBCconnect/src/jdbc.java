import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12339932";
		String uname="sql12339932";
		String pw="YdGqBiSKpc";
		/*
		 * This is getting data from table
		String quary="select first_name, last_name from employee where emp_id>100";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pw);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(quary);
		while(rs.next()) {
			String fname=rs.getString("first_name");
			String lname=rs.getString("last_name");
			System.out.println(fname + " " + lname);
		}
		*/
		
		
		
		
		
		
		/*
		 * normal way
		
		int num=110;
		String xString="harshana";
		String quary="INSERT INTO employee VALUES(109, 'Deshan', 'Halpert', '1978-10-01', 'M', 71000, 106, 3)";
		String quary2="INSERT INTO employee VALUES("+num+", '"+xString+"', 'Halpert', '1978-10-01', 'M', 71000, 106, 3)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pw);
		Statement st=con.createStatement();
		int rowAffected=st.executeUpdate(quary2);
		System.out.println(rowAffected);
		*/
		
		
		
		
		
		
		
		
		String quary="INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pw);
		PreparedStatement st=con.prepareStatement(quary);
		
		st.setInt(1, 111);
		st.setString(2, "Nawarathna");
		st.setString(3, "Walli");
		st.setString(4, "1997-10-15");
		st.setString(5, "M");
		st.setInt(6, 25000);
		st.setInt(7, 100);
		st.setInt(8, 5);
		
		int rowAffected=st.executeUpdate();
		System.out.println(rowAffected);
		
		
		
		
		
		st.close();
		con.close();
	}

}
