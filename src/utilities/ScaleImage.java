
package utilities;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ScaleImage {
    
    public void scaleImage(String image, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(image));
        // Reescalar la imagen usando la clase Image
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
}
