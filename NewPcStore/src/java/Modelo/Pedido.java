
package Modelo;

public class Pedido {
    private int id_pedido;
    private int usuario_id;
    private int producto_id;
    private int cantidad;
    private int precio;
    
    public Pedido() {
    }

    public Pedido(int id_pedido, int usuario_id, int producto_id, int cantidad, int precio) {
        this.id_pedido = id_pedido;
        this.usuario_id = usuario_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", usuario_id=" + usuario_id + ", producto_id=" + producto_id + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

    
    
    
    
}
