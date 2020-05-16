/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_PattarnExample1;

/**
 *
 * @author Deshan
 */
abstract class Plan {
    double rate;
    
    abstract void getRate();
    
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
    
}
