package configuracion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String url;
    private String password;
    private String user;
    private Connection conexion;

    public Conexion() {
            url="jdbc:mysql://localhost/persona";
            password="";
            user="root";
            
    }
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    public static void main(String[] args) {
        Conexion conexion=new Conexion();
        System.out.println(conexion.conexion());
    }
}
