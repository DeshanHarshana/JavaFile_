/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_PattarnExample2;

/**
 *
 * @author Deshan
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        
        Shape shape=shapeFactory.getShape("CIRCLE");
        
        shape.draw();
    }
    
}
