package Sprint_Tareas_CASA;


public class Tarea {

    // Atributos
    private String codigo;
    private String titulo;
    private double horas;
    private boolean completada;

    // Constructor
    public Tarea(String codigo, String titulo, double horas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        this.completada = false;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHoras() {
        return horas;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Setter
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Mostrar informacion
    public String mostrarInformacion() {

        return "Codigo: " + codigo +
                "\nTitulo: " + titulo +
                "\nHoras: " + horas +
                "\nCompletada: " + (completada ? "Si" : "No") +
                "\n-------------------------";
    }
}
