
package oopconcept;
import java.sql.*;  
class TestAbstraction1{  
public static void main(String args[]){  
 try {
	 
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:Student");
 Statement stmt=con.createStatement();
 
 ResultSet rs=stmt.executeQuery("SELECT * FROM emp");
 while(rs.next()) {
	 
	 
	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
 }
  
}catch(Exception ee){System.out.println(ee);}  
  
}}  