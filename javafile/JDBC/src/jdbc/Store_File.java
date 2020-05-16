
package jdbc;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Store_File {

    
    public static void main(String[] args) {
       String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Asanka";
         String lname="Rupasinga";
         
        String quary="insert into Student values(?,?,?)";
        try{
        
        Connection con=DriverManager.getConnection(url);
        PreparedStatement st=con.prepareStatement(quary);
        
        File f=new File("C://database/SaveJDBC.txt");  
        FileReader fr=new FileReader(f); 
        
        st.setString(1, null);// beacuse auto incremaent 
        st.setString(2, "File");
        st.setCharacterStream(3, fr,(int)f.length());
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
