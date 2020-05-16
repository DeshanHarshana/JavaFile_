/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deshan
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Deshan
 */
public class Conn {
    public static void main(String[] args) {
        
    
    Connection conn=null;
    
   
        try {
           Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\database\\bank_managment_system.db");
            System.out.println("Connect");
        } catch (Exception e) {
           System.out.println(e);
        }
       
    }
    
}


