
package Modelo;


public class Recomendacion {
    private String tipo_equipo;
    private String perfil_equipo;
    private String modelo;
    private String caracteristicas;
    private String perfil_cliente;
    private String precio;

    @Override
    public String toString() {
        return "Recomendacion{" + "tipo_equipo=" + tipo_equipo + ", perfil_equipo=" + perfil_equipo + ", modelo=" + modelo + ", caracteristicas=" + caracteristicas + ", perfil_cliente=" + perfil_cliente + ", precio=" + precio + '}';
    }
    

    public Recomendacion() {
    }

    public Recomendacion(String tipo_equipo, String perfil_equipo, String modelo, String caracteristicas, String perfil_cliente, String precio) {
        this.tipo_equipo = tipo_equipo;
        this.perfil_equipo = perfil_equipo;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.perfil_cliente = perfil_cliente;
        this.precio = precio;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    public String getPerfil_equipo() {
        return perfil_equipo;
    }

    public void setPerfil_equipo(String perfil_equipo) {
        this.perfil_equipo = perfil_equipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getPerfil_cliente() {
        return perfil_cliente;
    }

    public void setPerfil_cliente(String perfil_cliente) {
        this.perfil_cliente = perfil_cliente;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


}
