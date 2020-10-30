
package Modelo;

public class Producto {
    private int id_producto;
    private String referencia;
    private String serial;
    private String perfil;
    private int precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(int id_producto, String referencia, String serial, String perfil, int precio, int cantidad) {
        this.id_producto = id_producto;
        this.referencia = referencia;
        this.serial = serial;
        this.perfil = perfil;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", referencia=" + referencia + ", serial=" + serial + ", perfil=" + perfil + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
