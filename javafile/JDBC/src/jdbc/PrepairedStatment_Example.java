
package jdbc;
import java.sql.*;

public class PrepairedStatment_Example {

    
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Asanka";
         String lname="Rupasinga";
         
        String quary="insert into Student values(?,?,?)";
        try{
        
        Connection con=DriverManager.getConnection(url);
        PreparedStatement st=con.prepareStatement(quary);
        st.setString(1, null);// beacuse auto incremaent 
        st.setString(2, fname);
        st.setString(3, lname);
        int count =st.executeUpdate();
        System.out.println("Success");
        
        st.close();
        con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
