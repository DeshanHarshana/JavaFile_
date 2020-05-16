/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Deshan
 */
public class ServerSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("Client Connected");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println(str);
    }
    
}
