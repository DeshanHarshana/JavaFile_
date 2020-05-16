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
public class Symbian implements Phone{
    @Override
    public void getName() {
        System.out.println("This is Symbian Phone");
    }

    @Override
    public void getPrize() {
        System.out.println("Rs. 50000");

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSize() {
System.out.println("3 inch");        

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getReleaseYear() {
        
        System.out.println("2016");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
