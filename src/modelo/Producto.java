package modelo;

/**
 *
 * @author jorge
 */
public class Producto {
    
    //Atributos de esta clase
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int idProovedor;
    private int idUsuario;
    private int Estatus;
    
    //Constructor
    public Producto(){
        this.idProducto = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
        this.stock = 0;
        this.idProovedor = 0;
        this.idUsuario = 0;
        this.Estatus = 0;
    }
    //Constructor sobrecargado

    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock, int idProovedor, int idUsuario, int Estatus) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.idProovedor = idProovedor;
        this.idUsuario = idUsuario;
        this.Estatus = Estatus;
    }

    
    //getters y setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProovedor() {
        return idProovedor;
    }

    public void setIdProovedor(int idProovedor) {
        this.idProovedor = idProovedor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEstatus() {
        return Estatus;
    }

    public void setEstatus(int Estatus) {
        this.Estatus = Estatus;
    }

 
    
    
    
}
