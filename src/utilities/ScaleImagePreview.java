
package utilities;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ScaleImagePreview {
    
    public void scaleImage(String path, JLabel label){
        //ImageIcon icon = new ImageIcon(getClass().getResource(image));
        Image icon = new ImageIcon(path).getImage();
        // Reescalar la imagen usando la clase Image
        //Image img = icon.getImage();
        Image imgScale = icon.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
}
