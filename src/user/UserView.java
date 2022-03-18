package user;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import utilities.ScaleImage;

/**
 *
 * @author gab-uwu
 */
public class UserView extends javax.swing.JFrame {

    /**
     * Creates new form user_view
     */
    public static final String URL = "jdbc:mysql://localhost:3306/Recetario";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "aex1lol";
    static Connection conn = null;

    public void resizeImages() {
        ScaleImage resize = new ScaleImage();
        // Boton Hamburguesa para las opciones
        String burgerButton, userIcon, foodThumbnail;
        burgerButton = "/media/burger_button.png";
        userIcon = "/media/guest.png";
        foodThumbnail = "/media/burger.jpg";

        resize.scaleImage(burgerButton, this.burgerButton);
        resize.scaleImage(userIcon, this.userIcon);
        //resize.scaleImage(foodThumbnail, this.foodThumbnail);
    }

    public void showRecipes() {
        /*
        260, 240 Tamaño fijo,   40px de distancia   
        1.-  60-320, 140
         */
        int x = 60;
        int y = 140;
        int i = 1;

        try {
            conn = getConection();

            PreparedStatement ps;
            ResultSet res;
            ps = conn.prepareStatement("SELECT * FROM Receta");
            res = ps.executeQuery();

            while (res.next()) {
                
                JPanel foodCard1 = new JPanel();
                JLabel foodThumbnail1 = new JLabel();

                foodCard1.setBackground(new java.awt.Color(200, 200, 200));
                foodThumbnail1.setText(res.getString("id") + " " + res.getString("nombre") + " " + res.getString("categoria"));
                foodCard1.add(foodThumbnail1);
                //  x    y
                foodCard1.setBounds(x, y, 260, 240);

                Body.add(foodCard1);
                invalidate();
                validate();
                repaint();

                if(i%3 == 0){
                    y+= 270;
                    x = 60;
                }else{
                    x += 290;
                }
                i++;

//                FoodView food = new FoodView();
//                food.setVisible(true);
//                dispose();
                //JOptionPane.showMessageDialog(null, res.getString("id")+ " "+res.getString("nombre")+ " "+res.getString("categoria"));
            } //else {
//                JOptionPane.showMessageDialog(null, "No existen datos");
//            }

        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UserView() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        resizeImages();
        showRecipes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Body = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        burgerButton = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(230, 230, 230));
        jScrollPane1.setBorder(null);

        Body.setBackground(new java.awt.Color(230, 230, 230));

        Header.setBackground(new java.awt.Color(230, 230, 230));

        jTextField1.setBackground(new java.awt.Color(35, 61, 76));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        burgerButton.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(burgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(857, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Body);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Connection getConection() {
        // Objeto para la conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa");

        } catch (ClassNotFoundException e) {
            System.out.println("Ocurre una ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Ocurre una SQLException: " + e.getMessage());
        }
        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    public javax.swing.JLabel burgerButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
