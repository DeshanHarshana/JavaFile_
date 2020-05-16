
package jdbc;

import java.sql.*;


public class AddDataToTable {

   
    public static void main(String[] args) {
         String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Viraj";
         String lname="Madushan";
         
        String quary="insert into Student values ("+null+",'"+fname+"','"+lname+"')"; //beacuse id is auto increment 
        try{
        
        Connection con=DriverManager.getConnection(url);
        Statement st=con.createStatement();
        int count =st.executeUpdate(quary);
        
            System.out.println(count+ " Count");        
        
        }
        catch(Exception e){
            
        }
    }
    
}
