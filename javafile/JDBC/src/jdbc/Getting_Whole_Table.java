
package jdbc;

import java.sql.*;

public class Getting_Whole_Table {

    
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C://database/JDBC.db";
        String quary="select * from Student "; //whole Table
        try{
        
        Connection con=DriverManager.getConnection(url);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(quary);
        
        while(rs.next()){
        
        System.out.println(rs.getString(1)+" : "+rs.getString(2));
        }
        }
        catch(Exception e){
            
        }
    }
    
}
