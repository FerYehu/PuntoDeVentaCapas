package dto;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author jorge
 */
public class Dto_Producto {
        /**
     * **************************************************
     * metodo para guardar un nuevo Producto
     * **************************************************
     */
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into PRODUCTO values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getDescripcion());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setInt(5, objeto.getStock());
            consulta.setInt(6, objeto.getIdProovedor());
            consulta.setInt(7, objeto.getIdUsuario());
            consulta.setInt(8, objeto.getEstatus());
            
 
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya existe
     * ********************************************************************
     */
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "SELECT ID_PRODUCTO FROM PRODUCTOS WHERE ID_PRODUCTO =  '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
    
        
     /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("UPDATE PRODUCTO SET NOMBRE_PD = ? , STOCK = ? , PRECIO_UNITARIO  = ?, DESCRIPCION_PD = ? , ID_PROVEEDOR = ? , ESTATUS = ? WHERE ID_PRODUCTO = '" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getStock());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getIdProovedor());
            consulta.setInt(6, objeto.getEstatus());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }

        return respuesta;
    }
    
    
    /**
     * **************************************************
     * metodo para eliminar un producto
     * **************************************************
     */
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_categoria where idCategoria ='" + idProducto + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }

        return respuesta;
    }
}
