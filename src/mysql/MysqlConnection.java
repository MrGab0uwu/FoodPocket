package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlConnection {

//    public static final String URL = "jdbc:mysql://localhost:3306/Recetario";
//    public static final String USERNAME = "root";
//    public static final String PASSWORD = "aex1lol";
//    public static final String TABLE = "Receta";
    
    public static final String URL = "jdbc:mysql://umnqe1rhxbqzp495:fNahspd0GszlNeUQ8rUl@bdaznyk3nel9iufytkit-mysql.services.clever-cloud.com:3306/bdaznyk3nel9iufytkit";
    public static final String USERNAME = "umnqe1rhxbqzp495";
    public static final String PASSWORD = "fNahspd0GszlNeUQ8rUl";
    public static final String TABLE = "Receta";

    static Connection conn = null;

    public Connection getConection() {
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
    
}
