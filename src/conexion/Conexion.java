package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class Conexion {

    //Realiza la conexion local
    public static Connection conectar() {
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_IS", "root", "maldonado2515");
            return cn;
        } catch (SQLException e)
        {
            System.out.println("Error en la conexión local " + e);
        }
        return null;

    }
}
