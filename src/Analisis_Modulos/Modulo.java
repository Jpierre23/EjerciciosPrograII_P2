package Analisis_Modulos;

public class Modulo {

    // Atributos
    private String nombre;
    private String lenguaje;
    private int progreso;
    private boolean terminado;

    // Constructor
    public Modulo(String nombre, String lenguaje, int progreso, boolean terminado) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;

        if (progreso < 0 || progreso > 100) {
            throw new IllegalArgumentException("El progreso debe estar entre 0 y 100");
        }

        this.progreso = progreso;
        this.terminado = terminado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public boolean isTerminado() {
        return terminado;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\nLenguaje: " + lenguaje +
                "\nProgreso: " + progreso + "%" +
                "\nTerminado: " + (terminado ? "Sí" : "No") +
                "\n-------------------------";
    }
}
