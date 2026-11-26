package Pedido_Detalles_CASA;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Código: " + codigo +
                " | Producto: " + nombre +
                " | Precio: $" + precio;
    }
}
