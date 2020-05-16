
package jdbc;
import java.sql.*;
public class PrepairedStatment_Update {

 
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Asanka";
         String lname="Rupasinga";
         
        String quary="update Student set Name=?, Age=? where ID=?";
        try{
        
        Connection con=DriverManager.getConnection(url);
        PreparedStatement st=con.prepareStatement(quary);
        
        st.setString(1, "Nipun");
        st.setString(2, "Rathnawalli");
        st.setInt(3, 7);
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
