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
public class AssinmentWork {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }
    
    public void writeAssinment(String str){
        p.write(str);
    }
    
}
