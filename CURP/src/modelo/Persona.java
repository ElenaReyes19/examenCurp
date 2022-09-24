package modelo;

import com.mysql.jdbc.PreparedStatement;
import configuracion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String fecha_nacimiento;
    private String sexo;
    private String edo_nacimiento;
    private Conexion conexion=new Conexion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdo_nacimiento() {
        return edo_nacimiento;
    }

    public void setEdo_nacimiento(String edo_nacimiento) {
        this.edo_nacimiento = edo_nacimiento;
    }
    public void insertar(){
        try {
            PreparedStatement preparedStatement=(PreparedStatement) conexion.conexion().prepareStatement("INSERT INTO persona VALUES(null,?,?,?,?,?,?)");
            preparedStatement.setString(1, getNombre());
            preparedStatement.setString(2, getApellido_paterno());
            preparedStatement.setString(3, getApellido_materno());
            preparedStatement.setString(4, getFecha_nacimiento());
            preparedStatement.setString(5, getSexo());
            preparedStatement.setString(6, getEdo_nacimiento());
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
