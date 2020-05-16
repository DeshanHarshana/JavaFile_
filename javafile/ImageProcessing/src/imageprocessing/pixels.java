
package imageprocessing;
// Java program to demonstrate get and set pixel 
// values of an image 
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class pixels {

    
    public static void main(String[] args) {
        BufferedImage img = null; 
        File f = null; 
        
        //read image 
        try
        { 
            f = new File("F:\\img.jpg"); 
            img = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
        
        //get image width and height 
        int width = img.getWidth(); 
        int height = img.getHeight(); 
        
        /* get pixel value (the arguments in the getRGB method 
         denotes the  cordinates of the image from which the 
         pixel values need to be extracted) */
        int p = img.getRGB(0,0);
        
         /* We, have seen that the components of pixel occupy 
           8 bits. To get the bits we have to first right shift 
           the 32 bits of the pixels by bit position(such as 24 
           in case of alpha) and then bitwise ADD it with 0xFF. 
           0xFF is the hexadecimal representation of the decimal 
           value 255.  */
         // get alpha 
        int a = (p>>24) & 0xff; 
  
        // get red 
        int r = (p>>16) & 0xff; 
  
        // get green 
        int g = (p>>8) & 0xff; 
  
        // get blue 
        int b = p & 0xff; 
       
         /* 
        for simplicity we will set the ARGB 
        value to 255, 100, 150 and 200 respectively. 
        */
     
       
        
        //set the pixel value 
        p = (a<<2) | (r<<1) | (g<<8) | b; 
        System.out.println(p);
         img.setRGB(0, 0, p); 
         
         
   //write image 
        try
        { 
            f = new File("F:\\Out1.jpg"); 
            ImageIO.write(img, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
    } 
} 