
package javacv;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.bytedeco.javacv.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacpp.opencv_core.CvPoint;
import org.bytedeco.javacpp.opencv_core.CvSeq;
import org.bytedeco.javacpp.opencv_core.CvScalar;
import static org.bytedeco.javacpp.opencv_videoio.*;
import org.bytedeco.javacpp.indexer.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;




public class Javacv {

    
    public static void main(String[] args) throws IOException {
        
       IplImage img=cvLoadImage("C:/Users/Deshan/Desktop/Eranga & Sujeewan Engagement/f.jpg");
       IplImage hsvcre=cvCreateImage(cvGetSize(img), IPL_DEPTH_8U, 3); 
       IplImage grayimg=cvCreateImage(cvGetSize(img), IPL_DEPTH_8U, 1);
        cvCvtColor(img, hsvcre, CV_BGR2HSV);
        cvCvtColor(img, grayimg, CV_BGR2GRAY);
       
        cvShowImage("Original",img);
		cvShowImage("HSV",hsvcre);
		cvShowImage("GRAY",grayimg);
		cvWaitKey();
	byte[] data = new byte[img.getByteBuffer().capacity()];

        img.getByteBuffer().get(data);
BufferedImage bufImage = new BufferedImage(320, 240, BufferedImage.TYPE_3BYTE_BGR);
        data =  ((DataBufferByte) bufImage.getRaster().getDataBuffer()).getData();
        
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
      BufferedImage bImage2 = ImageIO.read(bis);
      ImageIO.write(bImage2, "jpg", new File("output.jpg") );
      System.out.println("image created");

        cvReleaseImage(img);
        cvReleaseImage(hsvcre);
        cvReleaseImage(grayimg);
    
    }
    
}
