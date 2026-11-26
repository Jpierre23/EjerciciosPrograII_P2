package Archivos_CASA;

public class Archivo {

    private String nombre;
    private double tamanoMB;

    public Archivo(String nombre, double tamanoMB) {
        this.nombre = nombre;
        this.tamanoMB = tamanoMB;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    // Método general
    public double calcularEspacioProcesado() {
        return tamanoMB;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                " | Tamaño: " + tamanoMB + " MB";
    }
}
