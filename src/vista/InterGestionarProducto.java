package vista;

import conexion.Conexion;
import dto.Dto_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author ediso
 */
public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idProducto;

    public InterGestionarProducto() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Productos");
        //Cargar tabla
        this.CargarTablaProductos();

        //Insertar imagen con codigo
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel3_wallpaper.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txt_descripcion2 = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_proovedor = new javax.swing.JTextField();
        txt_estatus = new javax.swing.JTextField();
        jLabel3_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Proovedor:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Estatus:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        txt_stock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 170, -1));

        txt_descripcion2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 170, -1));

        txt_proovedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_proovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        txt_estatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 870, 100));
        getContentPane().add(jLabel3_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        Producto producto = new Producto();
        Dto_Producto controlProducto = new Dto_Producto();
        
        //Validar campos
        if (txt_nombre.getText().isEmpty() || txt_precio.getText().isEmpty()  || txt_proovedor.getText().isEmpty()  || txt_stock.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");

        }else{
           //Consulta para verificar si el producto ya existe
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())){
                
                try{
                    producto.setNombre(txt_nombre.getText().trim());
                    producto.setStock(Integer.parseInt(txt_stock.getText().trim()));
                    String precioTXT = "";
                    double Precio = 0.0;
                    precioTXT = txt_precio.getText().trim();
                    boolean aux = false;
                    /*
                    Si el usuario ingresa coma como punto decimal
                    se tranforma en punto
                    */
                    for (int i = 0; i < precioTXT.length(); i++){
                        if (precioTXT.charAt(i)== ',')
                        {
                            String precioNuevo =  precioTXT.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                            
                        }
                        
                    }
                    
                    //evaluar la condicion
                    if (aux == true){
                        producto.setPrecio(Precio);
                    }else{
                        Precio = Double.parseDouble(precioTXT);
                        producto.setPrecio(Precio);
                    }
                    
                    producto.setDescripcion(txt_descripcion.getText().trim());
                    
                    if (controlProducto.guardar(producto))
                    {
                        JOptionPane.showMessageDialog(null, "Registro actualizado");
                        this.CargarTablaProductos();
                        this.Limpiar();
                    }else{
                    JOptionPane.showMessageDialog(null, "Error al actualizar");
  
                    }
                    
                    
                } catch(HeadlessException | NumberFormatException e) { 
                    System.out.println("Error en: " + e);
                }
            }else{
                            JOptionPane.showMessageDialog(null, "El producto ya existe");

            }
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        
        Dto_Producto controlProducto= new Dto_Producto();
        if (idProducto == 0){
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }else{
            if (!controlProducto.eliminar(idProducto)){
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            this.CargarTablaProductos();
            this.Limpiar();
            
            }else{
            JOptionPane.showMessageDialog(null, "Error al eliminar producto");    
            }
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_wallpaper;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_proovedor;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables

    
    //Metodo para limpiar
    
        private void Limpiar(){
        txt_nombre.setText("");
        txt_stock.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        txt_proovedor.setText("");
        txt_estatus.setText("");
    }
    /*
     * *****************************************************
     * metodo para mostrar todos los productos registradas
     * *****************************************************
     */
    
    String descripcionProducto = "";
    double precio = 0.0;
    double stock = 0;
    
    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM PRODUCTO;";
        Statement st;
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarProducto.jTable_productos = new JTable(model);
            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

            model.addColumn("idProducto");
            model.addColumn("Nombre");
            model.addColumn("Descripcion");
            model.addColumn("Precio");
            model.addColumn("Stock");
            model.addColumn("IdProovedor");
            model.addColumn("Id_usuarioalta");
            model.addColumn("Estatus");

            while (rs.next())
            {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++)
                {   
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e)
        {
            System.out.println("Error al llenar la tabla productos: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_productos.rowAtPoint(e.getPoint());
                int columna_point = 0;
            }
        });
    }

//    /*
//     * **************************************************
//     * Metodo que envia datos seleccionados
//     * **************************************************
//     */
//    private void EnviarDatosProductoSeleccionada(int idProducto) {
//        try
//        {
//            Connection con = Conexion.conectar();
//            PreparedStatement pst = con.prepareStatement(
//                    "SELECT * FROM PRODUCTO WHERE ID_PRODUCTO = '" + idProducto + "'");   
//            ResultSet rs = pst.executeQuery();
//            if (rs.next())
//            {
//                txt_nombre.setText(rs.getString("Nombre"));
//                txt_stock.setText(rs.getString("Stock"));
//                txt_precio.setText(rs.getString("Precio"));
//                txt_descripcion.setText(rs.getString("Descripcion"));
//                txt_proovedor.setText(rs.getString("Proovedor"));
//                txt_estatus.setText(rs.getString("Estatus"));
//
//            }
//            con.close();
//        } catch (SQLException e)
//        {
//            System.out.println("Error al seleccionar producto: " + e);
//        }
//    }
    private void EnviarDatosProductoSeleccionada(String nombre) {
    try {
        Connection con = Conexion.conectar();
        PreparedStatement pst = con.prepareStatement(
                "SELECT NOMBRE_PD, STOCK, PRECIO_UNITARIO, DESCRIPCION_PD, ID_PROVEEDOR, ESTATUS " +
                "FROM PRODUCTO WHERE NOMBRE_PD = ?");
        pst.setString(1, nombre);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            System.out.println("Nombre: " + rs.getString("NOMBRE_PD"));
            System.out.println("Stock: " + rs.getString("STOCK"));
            System.out.println("Precio: " + rs.getString("PRECIO_UNITARIO"));
            System.out.println("Descripción: " + rs.getString("DESCRIPCION_PD"));
            System.out.println("Proveedor: " + rs.getString("ID_PROVEEDOR"));
            System.out.println("Estatus: " + rs.getString("ESTATUS"));

            txt_nombre.setText(rs.getString("NOMBRE_PD"));
            txt_stock.setText(rs.getString("STOCK"));
            txt_precio.setText(rs.getString("PRECIO_UNITARIO"));
            txt_descripcion.setText(rs.getString("DESCRIPCION_PD"));
            txt_proovedor.setText(rs.getString("ID_PROVEEDOR"));
            txt_estatus.setText(rs.getString("ESTATUS"));
        } else {
            System.out.println("No se encontraron resultados para el nombre: " + nombre);
        }
        con.close();
    } catch (SQLException e) {
        System.out.println("Error al seleccionar producto: " + e);
    }
}



}
