package dto;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;

/**
 *
 * @author jorge
 */
public class Dto_Cliente {

        public boolean existeCliente(String idCliente) {
            boolean respuesta = false;
            String sql = "SELECT ID_CLIENTE FROM CLIENTE WHERE ID_CLIENTE =  '" + idCliente + "';";
            Statement st;

            try
            {
                Connection cn = Conexion.conectar();
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next())
                {
                    respuesta = true;
                }

            } catch (SQLException e)
            {
                System.out.println("Error al consultar cliente: " + e);
            }
            return respuesta;
        }
        
        
        /**
         * **************************************************
         * metodo para guardar un nuevo cliente
         * **************************************************
         */
        public boolean guardar(Cliente objeto) {
            boolean respuesta = false;
            Connection cn = Conexion.conectar();
            try
            {

                PreparedStatement consulta = cn.prepareStatement("insert into CLIENTE values(?,?,?,?,?,?,?,?)");
                consulta.setInt(1, 0); //id
                consulta.setString(2, objeto.getNombre());
                consulta.setString(3, objeto.getRFC());
                consulta.setString(4, objeto.getEmail());
                consulta.setString(5, objeto.getDireccion());
                consulta.setInt(6, objeto.getTelefono());
                consulta.setInt(7, objeto.getIdUsuarioalta());
                consulta.setString(8, objeto.getEstatus());

                if (consulta.executeUpdate() > 0)
                {
                    respuesta = true;
                }

                cn.close();

            } catch (SQLException e)
            {
                System.out.println("Error al guardar cliente: " + e);
            }

            return respuesta;
        }

    public class Ctrl_Producto {


        /**
         * ********************************************************************
         * metodo para consultar si el producto ya existe
         * ********************************************************************
         */

    }

}
