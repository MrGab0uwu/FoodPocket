package utilities;

import javax.swing.JLabel;

public class JLabelImage {

    String path = "";

    public JLabelImage(String path, JLabel object) {
        ScaleImage resize = new ScaleImage();
        this.path = path;
        resize.scaleImage(path, object);
    }
}
