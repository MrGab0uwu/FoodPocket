package utilities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ScaleImageMysql {

    public void scaleImage(BufferedImage path, JLabel label){
        //ImageIcon icon = new ImageIcon(getClass().getResource(image));
        //Image icon = new ImageIcon(path).getImage();
        
        BufferedImage img = path;

        // Reescalar la imagen usando la clase Image
        //Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
        System.out.println();
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }

}
