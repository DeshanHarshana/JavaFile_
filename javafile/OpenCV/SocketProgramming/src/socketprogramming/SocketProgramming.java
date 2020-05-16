
package socketprogramming;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class SocketProgramming {

 
    public static void main(String[] args) throws IOException {
       String ip="localhost";
       
       int port=9999;
       Socket s=new Socket(ip,port);
       String name="Deshan";
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter writer=new PrintWriter(os);
        os.write(name);
        os.flush();
        
        
    }
    
}
