package vista;

import Controlador.Ctrl_Producto;
import dto.Dto_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author jorge
 */
public class InterProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterProducto
     */
    
    int obtenerIdCategoriaCombo = 0;
    public InterProducto() {
        initComponents();
        //this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Producto");
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_proovedor = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txt_estatus = new javax.swing.JTextField();
        jButton1_Guardar = new javax.swing.JButton();
        jLabel1_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Id Producto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Proovedor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Stock:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Estatus:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txt_idproducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_idproducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_idproducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_idproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idproductoActionPerformed(evt);
            }
        });
        txt_idproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idproductoKeyPressed(evt);
            }
        });
        getContentPane().add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 170, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioKeyPressed(evt);
            }
        });
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyPressed(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, -1));

        txt_proovedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_proovedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_proovedor.setForeground(new java.awt.Color(0, 0, 0));
        txt_proovedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_proovedorKeyPressed(evt);
            }
        });
        getContentPane().add(txt_proovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, -1));

        txt_stock.setBackground(new java.awt.Color(255, 255, 255));
        txt_stock.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_stock.setForeground(new java.awt.Color(0, 0, 0));
        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_stockKeyPressed(evt);
            }
        });
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        txt_estatus.setBackground(new java.awt.Color(255, 255, 255));
        txt_estatus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_estatus.setForeground(new java.awt.Color(0, 0, 0));
        txt_estatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_estatusKeyPressed(evt);
            }
        });
        getContentPane().add(txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        jButton1_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton1_Guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1_Guardar.setText("Guardar");
        jButton1_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, 30));

        jLabel1_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_GuardarActionPerformed
            Producto producto = new Producto();
            Ctrl_Producto controladorProducto = new Ctrl_Producto();
    
    controladorProducto.guardarProducto(producto, txt_nombre, txt_precio, txt_stock, txt_descripcion, txt_idproducto, txt_proovedor, txt_estatus);
    }//GEN-LAST:event_jButton1_GuardarActionPerformed

    private void txt_idproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idproductoActionPerformed

    private void txt_idproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idproductoKeyPressed
        // TODO add your handling code here:      
        //ID PRODUCTO
        
        if (evt.getKeyCode() == evt.VK_ENTER){
            txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_txt_idproductoKeyPressed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
       //Nombre
        
        if (evt.getKeyCode() == evt.VK_ENTER){
            txt_precio.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyPressed
       //Nombre
        
        if (evt.getKeyCode() == evt.VK_ENTER){
            txt_descripcion.requestFocus();
        }
    }//GEN-LAST:event_txt_precioKeyPressed

    private void txt_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyPressed
       //Descripcion
        
        if (evt.getKeyCode() == evt.VK_ENTER){
          txt_proovedor.requestFocus();
        }
    }//GEN-LAST:event_txt_descripcionKeyPressed

    private void txt_proovedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_proovedorKeyPressed
       //Proovedor
        
        if (evt.getKeyCode() == evt.VK_ENTER){
          txt_stock.requestFocus();
        }
    }//GEN-LAST:event_txt_proovedorKeyPressed

    private void txt_stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyPressed
       //Stock
        
        if (evt.getKeyCode() == evt.VK_ENTER){
          txt_estatus.requestFocus();
        }
    }//GEN-LAST:event_txt_stockKeyPressed

    private void txt_estatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estatusKeyPressed
       //Estatus
        
        if (evt.getKeyCode() == evt.VK_ENTER){
         jButton1_GuardarActionPerformed(null); // Llama al método del botón
        }
    }//GEN-LAST:event_txt_estatusKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1_wallpaper;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_idproducto;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_proovedor;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables

    //Metodo para limpiar los campos
    
    private void Limpiar(){
        txt_nombre.setText("");
        txt_stock.setText("");
        txt_idproducto.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        txt_proovedor.setText("");
        txt_estatus.setText("");
    }
}

