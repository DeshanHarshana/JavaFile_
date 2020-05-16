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
public interface Shape {
    void draw();
    
    public static void getRate(){
        //we can create static method inside interface
    }
    
}
