
package chat_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MassageListern extends Thread{
    ServerSocket server;
    int port=8877;
    WritableGUI gui;
    
    
    public MassageListern(WritableGUI gui,int port){
        this.port=port;
        this.gui=gui;
        try {
            server=new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(MassageListern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public MassageListern(){
        try {
            server=new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(MassageListern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    public void run(){
        Socket clientsocket;
        try {
            while((clientsocket=server.accept()) != null){
                InputStream is=clientsocket.getInputStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                
                String line=br.readLine();
                if(line!=null){
                    gui.write(line);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
