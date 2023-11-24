package Controlador;

import dto.Dto_Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;

/**
 *
 * @author jorge
 */
public class Ctrl_Cliente {
        private final Dto_Cliente dtoCliente;

    public Ctrl_Cliente() {
        this.dtoCliente = new Dto_Cliente();
    }
    
        public void guardarCliente(Cliente cliente, JTextField txtIdCliente, JTextField txtNombre, JTextField txtRFC, JTextField txtEmail,
                               JTextField txtDireccion, JTextField txtTelefono, JTextField txtIdUsuarioAlta, JTextField txtEstatus) {
        if (!txtNombre.getText().isEmpty() || txtRFC.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtIdUsuarioAlta.getText().isEmpty()) {
            if (!dtoCliente.existeCliente(txtIdCliente.getText().trim())) {
                cliente.setNombre(txtNombre.getText().trim());
                cliente.setRFC(txtRFC.getText().trim());
                cliente.setEmail(txtEmail.getText().trim());
                cliente.setDireccion(txtDireccion.getText().trim());
                
                try {
                    cliente.setTelefono(Integer.parseInt(txtTelefono.getText().trim()));
                } catch (NumberFormatException e) {
                    // Manejar el error si el campo no es un número válido
                    JOptionPane.showMessageDialog(null, "El campo Teléfono debe ser un número válido.");
                    return;
                }
                
                // Otros campos...
                
                cliente.setEstatus(txtEstatus.getText().trim());

                if (dtoCliente.guardar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    // Resto del código para limpiar campos o realizar otras acciones necesarias
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya existe en la bdd");
                // Resto del código para manejar el caso en que el cliente ya existe
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos");
            // Resto del código para manejar el caso en que no se completaron todos los campos
        }
    }
}
