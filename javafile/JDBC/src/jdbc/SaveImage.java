/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Deshan
 */
public class SaveImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C://database/JDBC.db";
         String fname="Asanka";
         String lname="Rupasinga";
         
        String quary="insert into Student values(?,?,?)";
        try{
        
        Connection con=DriverManager.getConnection(url);
        PreparedStatement st=con.prepareStatement(quary);
        
        FileInputStream fin=new FileInputStream("C://database/Example.jpg"); 
        
        st.setString(1, null);// beacuse auto incremaent 
        st.setString(2, "Picture");
        st.setBinaryStream(3, fin,fin.available());
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
