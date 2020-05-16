import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    Connection conn;
    
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
    
}
