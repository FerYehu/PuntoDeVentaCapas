package dto;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author jorge
 */
public class Dto_Usuario {

    //Metodo para iniciar sesión
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "SELECT NOMBRE_US,PASSWORD_US FROM USUARIO WHERE NOMBRE_US = '" + objeto.getNombreUs() + "' AND PASSWORD_US = '" + objeto.getPasswordUs() + "'";
        Statement st;
        try
        {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                respuesta = true;
            }
        } catch (SQLException e)
        {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return respuesta;
    }
}
