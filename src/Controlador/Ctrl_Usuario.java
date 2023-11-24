/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import dto.Dto_Usuario;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.FrmMenu;

/**
 *
 * @author jorge
 */
public class Ctrl_Usuario {
       public void loginUsuario(String nombreUsuario, String password) {
        if (!nombreUsuario.isEmpty() && !password.isEmpty()) {
            Dto_Usuario controlUsuario = new Dto_Usuario();
            Usuario usuario = new Usuario();
            usuario.setNombreUs(nombreUsuario.trim());
            usuario.setPasswordUs(password.trim());

            if (controlUsuario.loginUser(usuario)) {
                // JOptionPane.showMessageDialog(null, "Acceso correcto");
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
                // Puedes cerrar la ventana actual si es necesario
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus datos de usuario");
        }
    }
}
