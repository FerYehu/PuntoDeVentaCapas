package modelo;

/**
 *
 * @author jorge
 */
public class Usuario {

    // Atributos
    private int idUsuario;
    private String nombreUs; // Ajustado para que coincida con NOMBRE_US
    private String passwordUs; // Ajustado para que coincida con PASSWORD_US
    private int idRole; // Ajustado para que coincida con ID_ROLE
    private int estatus;

    // Constructor
    public Usuario() {
        this.idUsuario = 0;
        this.nombreUs = "";
        this.passwordUs = "";
        this.idRole = 0;
        this.estatus = 0;
    }

    // Getters y setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getPasswordUs() {
        return passwordUs;
    }

    public void setPasswordUs(String passwordUs) {
        this.passwordUs = passwordUs;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
