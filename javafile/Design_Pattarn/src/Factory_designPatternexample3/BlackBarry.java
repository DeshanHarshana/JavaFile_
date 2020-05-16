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
public class BlackBarry implements Phone{
    @Override
    public void getName() {
        System.out.println("This is BlackBarry Phone");
    }

    @Override
    public void getPrize() {
        System.out.println("Rs. 600000");

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSize() {
System.out.println("2 inch");        

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getReleaseYear() {
        
        System.out.println("2014");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
