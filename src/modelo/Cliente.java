package modelo;

/**
 *
 * @author jorge
 */
public class Cliente {
    
    //Atributos
    
    private int idCliente;
    private String nombre;
    private String RFC;
    private String email;
    private String direccion;
    private int telefono;
    private int idUsuarioalta;
    private String estatus;
    
    //Contructor 
    
    public Cliente(){
        this.idCliente = 0;
        this.nombre = "";
        this.RFC = "";
        this.email = "";
        this.direccion = "";
        this.telefono = 0;
        this.idUsuarioalta = 0;
        this.estatus = "";
    }
    
    //Contructor sobrecargado

    public Cliente(int idCliente, String nombre, String RFC, String email, String direccion, int telefono, int idUsuarioalta, String estatus) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.RFC = RFC;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idUsuarioalta = idUsuarioalta;
        this.estatus = estatus;
    }

    public int getIdUsuarioalta() {
        return idUsuarioalta;
    }

    //getters y setters
    public void setIdUsuarioalta(int idUsuarioalta) {
        this.idUsuarioalta = idUsuarioalta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
}
