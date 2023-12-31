package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author jorge
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem2_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem5_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem6_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem8_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15_reportes_cliente = new javax.swing.JMenuItem();
        jMenuItem17_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem3_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem19_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem20_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem1_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem1_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem1_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jMenuItem1_nuevo_usuario);

        jMenuItem2_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem2_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem2_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu1.add(jMenuItem2_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem4_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem4_nuevo_producto.setText("Nuevo Producto");
        jMenuItem4_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem4_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4_nuevo_producto);

        jMenuItem5_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem5_gestionar_producto.setText("Gestionar Producto");
        jMenuItem5_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem5_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5_gestionar_producto);

        jMenuItem6_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem6_actualizar_stock.setText("Actualizar Stock");
        jMenuItem6_actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem6_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem7_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem7_nuevo_cliente.setText("Nuevo cliente");
        jMenuItem7_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem7_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7_nuevo_cliente);

        jMenuItem8_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem8_gestionar_cliente.setText("Gestionar Cliente");
        jMenuItem8_gestionar_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem8_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem15_reportes_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15_reportes_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem15_reportes_cliente.setText("Reportes Cliente");
        jMenuItem15_reportes_cliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem15_reportes_cliente);

        jMenuItem17_reportes_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem17_reportes_productos.setText("Reportes Productos");
        jMenuItem17_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem17_reportes_productos);

        jMenuItem3_reportes_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem3_reportes_ventas.setText("Reportes Ventas");
        jMenuItem3_reportes_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem3_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem19_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem19_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem19_ver_historial.setText("Ver Historial");
        jMenuItem19_ver_historial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu7.add(jMenuItem19_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem20_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem20_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem20_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem20_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu8.add(jMenuItem20_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_actualizar_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6_actualizar_stockActionPerformed

    private void jMenuItem8_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_gestionar_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8_gestionar_clienteActionPerformed

    private void jMenuItem4_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_nuevo_productoActionPerformed
       InterProducto interProducto = new InterProducto();
       jDesktopPane_menu.add(interProducto);
       interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem4_nuevo_productoActionPerformed

    private void jMenuItem5_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5_gestionar_productoActionPerformed
       InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
       jDesktopPane_menu.add(interGestionarProducto);
       interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem5_gestionar_productoActionPerformed

    private void jMenuItem7_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7_nuevo_clienteActionPerformed
       InterCliente interCliente = new InterCliente();
       jDesktopPane_menu.add(interCliente);
       interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem7_nuevo_clienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15_reportes_cliente;
    private javax.swing.JMenuItem jMenuItem17_reportes_productos;
    private javax.swing.JMenuItem jMenuItem19_ver_historial;
    private javax.swing.JMenuItem jMenuItem1_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem20_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem2_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem3_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem4_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem5_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem6_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem7_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem8_gestionar_cliente;
    // End of variables declaration//GEN-END:variables
}
