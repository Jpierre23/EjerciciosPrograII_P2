package Vendedores_CASA;

public class Vendedor {

    private String identificacion;
    private String nombre;
    private double ventas;

    // Constructor
    public Vendedor(String identificacion, String nombre,
                    double ventas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.ventas = ventas;
    }

    // Getters
    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Identificación: " + identificacion +
                " | Nombre: " + nombre +
                " | Ventas: $" + ventas;
    }
}
