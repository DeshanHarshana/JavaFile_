
package jdbc;
import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:C://database/JDBC.db";
        String quary="select Name from Student where ID=2";// this will send us whole table but only name colom id 3 is availble. others are null
        try{
        
        Connection con=DriverManager.getConnection(url);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(quary);
        
        while(rs.next()){
        
        System.out.println(rs.getString(1));
        }
        }
        catch(Exception e){
            
        }
    }
    
}
