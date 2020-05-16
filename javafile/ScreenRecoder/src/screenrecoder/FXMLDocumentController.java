/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenrecoder;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Deshan
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private Button button;
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void clickButton(ActionEvent event){
        try {
            Robot robot=new Robot();
            
            Rectangle rectangle=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            
            BufferedImage image=robot.createScreenCapture(rectangle);
            Image myImage=SwingFXUtils.toFXImage(image, null);
            JFileChooser jfc = new JFileChooser();
            int retVal = jfc.showSaveDialog(null);
            if(retVal==JFileChooser.APPROVE_OPTION){
            File f = jfc.getSelectedFile();
            String test = f.getAbsolutePath();
            ImageIO.write(image,"png",f);
            }
            
           
            
        } catch (Exception ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
