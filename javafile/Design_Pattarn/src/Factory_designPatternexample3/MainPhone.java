/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_designPatternexample3;

/**
 *
 * @author Deshan
 */
public class MainPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PhoneFactory phoneFactory=new PhoneFactory();
       Phone p=phoneFactory.getPhone("IOS");
       
       p.getName();
       p.getPrize();
       p.getReleaseYear();
       p.getSize();
       
       p=phoneFactory.getPhone("Android");
       
       p.getName();
       p.getPrize();
       p.getReleaseYear();
       p.getSize();
       
       
       p=phoneFactory.getPhone("Symbian");
       
       p.getName();
       p.getPrize();
       p.getReleaseYear();
       p.getSize();
       
       
       
       
    }
    
    
    
}
