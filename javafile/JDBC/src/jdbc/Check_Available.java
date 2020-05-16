/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check_Available {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Asanka";
         String lname="Rupasinga";
         
        String quary="select * from Student where Name=? and Age=? and ID=?";
        try{
        
        Connection con=DriverManager.getConnection(url);
        PreparedStatement st=con.prepareStatement(quary);
        
        st.setString(1, "Nipun");
        st.setString(2, "Kaushalya");
        st.setInt(3, 4);
        ResultSet rs=st.executeQuery();
        if(rs.next()){
            System.out.println("Available");
        }
        else{
            System.out.println("Not Available");
        }
        
        
        
       
        
        st.close();
        con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
