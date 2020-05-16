/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import org.opencv.core.Core; 
import org.opencv.core.Mat;  
import org.opencv.core.CvType;  
import org.opencv.core.Scalar;   

 
public class JavaApplication11 {

    
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat=new Mat(5,5,CvType.CV_8UC1,new Scalar(0));
        Mat row0=mat.row(0);
        row0.setTo(new Scalar(5));
        Mat col3=mat.col(3);
        col3.setTo(new Scalar(9));
        System.out.println(mat.dump());
        
        
        
        
        
        
        
        
    }
    
}
