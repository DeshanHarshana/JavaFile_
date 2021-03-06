import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deshan
 */
public class NewJFrame extends javax.swing.JFrame {
    static {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
  }
private CascadeClassifier mCascadeClassifier;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jFrame1.setVisible(true);
        
    }
     public void face(){
      if(face==true){
          jLabel2.setText("Face Found");
          this.face=false;
      }
      else{
           jLabel2.setText("Face Not Found");
      }
  }
    private void loadCascade() {
    mCascadeClassifier = 
        new CascadeClassifier("src/resources/haarcascade_frontalface.xml");
  }
    private void camLoop(String[] args) {
    Mat mMat = new Mat();
    Image mImage;
    VideoCapture mVideoCapture = new VideoCapture(0);

    mVideoCapture.set(Videoio.CAP_PROP_FRAME_WIDTH, 640);
    mVideoCapture.set(Videoio.CAP_PROP_FRAME_HEIGHT, 480);

    if (mVideoCapture.isOpened()) {
      while (true) {
        mVideoCapture.read(mMat);
        if (!mMat.empty()) {
          findAndDraw(mMat);
          mImage = toBufferedImage(mMat);
          ImageIcon imageIcon = new ImageIcon(mImage, "Webcam frame");
          jLabel1.setIcon(imageIcon);
          jFrame1.pack();
          if(face==true){
          jLabel2.setText("Face Found");
          this.face=false;
          }
          else{
              jLabel2.setText("Face Not Found");
          }
          
        } else {
          System.err.println("Webcam frame empty!");
          break;
        }
      }
    } else {
      System.err.println("Couldn't open webcam.");
    }
  }

  private BufferedImage toBufferedImage(Mat mMat) {
    int type = BufferedImage.TYPE_BYTE_GRAY;
    if (mMat.channels() > 1) {
      type = BufferedImage.TYPE_3BYTE_BGR;
    }
    
    int bufferSize = mMat.channels() * mMat.cols() * mMat.rows();
    byte[] buffer = new byte[bufferSize];
    mMat.get(0, 0, buffer);
    BufferedImage image = new BufferedImage(mMat.cols(), mMat.rows(), type);
    final byte[] targetPixels = 
        ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
    System.arraycopy(buffer, 0, targetPixels, 0, buffer.length);
    
    return image;
  }
  boolean face=false;
  private void findAndDraw(Mat mMat) {
    MatOfRect faceDetections = new MatOfRect();
    mCascadeClassifier.detectMultiScale(mMat, faceDetections);
    
	for (Rect rect : faceDetections.toArray()) {
      Imgproc.rectangle(mMat, new Point(rect.x, rect.y), 
          new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
            this.face=true;
           
            
    }
  }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel2)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        NewJFrame app = new NewJFrame();
    
    app.loadCascade();
    app.camLoop(args);
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

