package Tareas_de_desarrollo_CASA;


public class AnalizadorTareas {

    // Atributo
    private Tarea[] tareas;

    // Constructor
    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    // Contar tareas completadas
    public int contarCompletadas() {

        int contador = 0;

        for (int i = 0; i < tareas.length; i++) {

            if (tareas[i] != null && tareas[i].isCompletada()) {
                contador++;
            }
        }

        return contador;
    }

    // Calcular horas totales
    public int calcularHorasTotales() {

        int suma = 0;

        for (int i = 0; i < tareas.length; i++) {

            if (tareas[i] != null) {
                suma += tareas[i].getHorasEstimadas();
            }
        }

        return suma;
    }

    // Buscar tarea por codigo
    public Tarea buscarPorCodigo(String codigo) {

        for (int i = 0; i < tareas.length; i++) {

            if (tareas[i] != null &&
                    tareas[i].getCodigo().equals(codigo)) {

                return tareas[i];
            }
        }

        return null;
    }

    // Obtener tarea de mayor duracion
    public Tarea obtenerTareaMayorDuracion() {

        Tarea mayor = null;

        for (int i = 0; i < tareas.length; i++) {

            if (tareas[i] != null) {

                if (mayor == null ||
                        tareas[i].getHorasEstimadas() > mayor.getHorasEstimadas()) {

                    mayor = tareas[i];
                }
            }
        }

        return mayor;
    }

    // Calcular porcentaje de tareas completadas
    public double calcularPorcentajeCompletadas() {

        int total = 0;
        int completadas = 0;

        for (int i = 0; i < tareas.length; i++) {

            if (tareas[i] != null) {
                total++;

                if (tareas[i].isCompletada()) {
                    completadas++;
                }
            }
        }

        if (total == 0) {
            return 0;
        }

        return (double) completadas / total * 100;
    }
}
