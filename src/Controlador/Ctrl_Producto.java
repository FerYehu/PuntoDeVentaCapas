package Controlador;

import dto.Dto_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Producto;

/**
 *
 * @author jorge
 */
public class Ctrl_Producto {

    private final Dto_Producto controlProducto;

    public Ctrl_Producto() {
        this.controlProducto = new Dto_Producto();
}
    
    public void guardarProducto(Producto producto, JTextField txtNombre, JTextField txtPrecio, JTextField txtStock, JTextField txtDescripcion,
                                JTextField txtIdProducto, JTextField txtProovedor, JTextField txtEstatus) {
        // Validar campos
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            marcarCamposComoError(txtNombre, txtPrecio, txtStock, txtIdProducto, txtDescripcion, txtProovedor, txtEstatus);
        } else {
            // Consulta para verificar si el producto ya existe
            if (!controlProducto.existeProducto(txtNombre.getText().trim())) {
                try {
                    producto.setNombre(txtNombre.getText().trim());
                    producto.setStock(Integer.parseInt(txtStock.getText().trim()));
                    String precioTXT = txtPrecio.getText().trim();
                    double precio = obtenerPrecioValido(precioTXT);
                    producto.setPrecio(precio);
                    producto.setDescripcion(txtDescripcion.getText().trim());

                    if (controlProducto.guardar(producto)) {
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                        marcarCamposComoCorrectos(txtNombre, txtPrecio, txtStock, txtIdProducto, txtDescripcion, txtProovedor, txtEstatus);
                        LimpiarCampos(txtNombre, txtPrecio, txtStock, txtIdProducto, txtDescripcion, txtProovedor, txtEstatus);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }
        }
    }

    private void marcarCamposComoError(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setBackground(Color.red);
        }
    }

    private void marcarCamposComoCorrectos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setBackground(Color.green);
        }
    }

    private void LimpiarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    private double obtenerPrecioValido(String precioTXT) {
        double precio = 0.0;
        boolean comaPresente = precioTXT.contains(",");

        if (comaPresente) {
            String precioNuevo = precioTXT.replace(",", ".");
            precio = Double.parseDouble(precioNuevo);
        } else {
            precio = Double.parseDouble(precioTXT);
        }

        return precio;
    }
}