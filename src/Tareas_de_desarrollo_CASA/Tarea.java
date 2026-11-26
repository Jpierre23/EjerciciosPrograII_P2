package Tareas_de_desarrollo_CASA;


public class Tarea {

    // Atributos
    private String codigo;
    private String titulo;
    private int horasEstimadas;
    private boolean completada;

    // Constructor
    public Tarea(String codigo, String titulo, int horasEstimadas, boolean completada) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.completada = completada;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Setter
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Codigo: " + codigo +
                "\nTitulo: " + titulo +
                "\nHoras estimadas: " + horasEstimadas +
                "\nCompletada: " + (completada ? "Si" : "No") +
                "\n-------------------------";
    }
}
