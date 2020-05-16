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
public class PhoneFactory {
    
    public Phone getPhone(String PhoneType){
        if(PhoneType==null){
            return null;
            
        }
        if(PhoneType=="Android"){
            return new Android();
        }
        else if(PhoneType=="IOS"){
            return new IOS();
        }
        else if(PhoneType=="Symbian"){
            return new Symbian();
        }
        else if(PhoneType=="BlackBarry"){
            return new BlackBarry();
        }
        else if(PhoneType=="WindowsPhone"){
            return new WindowsPhone();
        }
        
        
        
        return null;
        
    }
    
}
