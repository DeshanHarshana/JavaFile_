/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_app;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deshan
 */
public class MessageTransmitter extends Thread{
    String Message,hostname;
    int port;

    public MessageTransmitter(String Message, String hostname, int port) {
        this.Message = Message;
        this.hostname = hostname;
        this.port = port;
    }

    public MessageTransmitter() {
    }

    @Override
    public void run() {
        try {
            Socket s=new Socket(hostname, port);
            s.getOutputStream().write(Message.getBytes());
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(MessageTransmitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
