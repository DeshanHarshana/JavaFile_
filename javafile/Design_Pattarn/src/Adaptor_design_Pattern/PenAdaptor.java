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
public class PenAdaptor implements Pen{
    
    KamalPen fp =new KamalPen();
    
    //we can use anyone pen via this class
    //we only need to create an object.
    //if we want to use NuwanPen class make NuwanPen object then we can use it;
    
    @Override
    public void write(String str){
        fp.mark(str);
    }
}
