package utilities;

import java.awt.image.BufferedImage;
import javax.swing.JLabel;

public class JLabelImage {

    public JLabelImage() {

    }

    public void scalelImage(String path, JLabel object) {
        ScaleImage resize = new ScaleImage();
        resize.scaleImage(path, object);
    }

      public void scalelImageExt(String path, JLabel object) {
        ScaleImagePreview resize = new ScaleImagePreview();
        resize.scaleImage(path, object);
    }
    
    
    public void scalelImageMysql(BufferedImage path, JLabel object) {
        ScaleImageMysql resize = new ScaleImageMysql();
        resize.scaleImage(path, object);
    }
}
