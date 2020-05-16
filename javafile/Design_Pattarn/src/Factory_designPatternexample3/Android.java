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
public class Android implements Phone{

    @Override
    public void getName() {
        System.out.println("This is Android Phone");
    }

    @Override
    public void getPrize() {
        System.out.println("Rs. 100000");

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSize() {
System.out.println("5 inch");        

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getReleaseYear() {
        
        System.out.println("2010");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
