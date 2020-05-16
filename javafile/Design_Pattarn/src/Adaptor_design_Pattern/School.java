/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptor_design_Pattern;

/**
 *
 * @author Deshan
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //FriendsPen fp=new FriendsPen(); we can't assign ft to setP method because it needs Pen object
       //therefore we have to make new class for connect FriendPen class and P interface
       //now i am going to make Pen Adaptor class in order to connect two things
       
       Pen p=new PenAdaptor();
       AssinmentWork aw=new AssinmentWork();
       aw.setP(p);
       aw.writeAssinment("THis is the title");
    }
    
}
