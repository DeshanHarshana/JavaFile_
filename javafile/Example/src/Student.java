
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deshan
 */
import java.util.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;

import javax.media.j3d.BranchGroup;
public class Student {
    public void Hello3d()

{

   SimpleUniverse universe = new SimpleUniverse();

   BranchGroup group = new BranchGroup();

   group.addChild(new ColorCube(0.3));

   universe.getViewingPlatform().setNominalViewingTransform();

   universe.addBranchGraph(group);

}

   
    public static void main(String[] args) {
        System.setProperty("sun.awt.noerasebackground", "true");

   Student std=new Student();
   std.Hello3d();
        
            
            
        
        // TODO code application logic here
    }
    
}
