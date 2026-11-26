package Sprint_Tareas_CASA;


import java.util.ArrayList;

public class Sprint {

    // Atributo
    private ArrayList<Tarea> tareas;

    // Constructor
    public Sprint() {
        tareas = new ArrayList<>();
    }

    public boolean crearTarea(String codigo, String titulo, double horas) {

        // Comprobar que no exista el codigo
        for (Tarea tarea : tareas) {

            if (tarea.getCodigo().equals(codigo)) {
                return false;
            }
        }

        // Crear tarea internamente
        Tarea nuevaTarea = new Tarea(codigo, titulo, horas);

        // Agregar a la lista
        tareas.add(nuevaTarea);

        return true;
    }

    public Tarea buscarTarea(String codigo) {

        for (Tarea tarea : tareas) {

            if (tarea.getCodigo().equals(codigo)) {
                return tarea;
            }
        }

        return null;
    }

    public boolean completarTarea(String codigo) {

        Tarea encontrada = buscarTarea(codigo);

        if (encontrada != null) {

            encontrada.setCompletada(true);
            return true;
        }

        return false;
    }

    public int contarCompletadas() {

        int contador = 0;

        for (Tarea tarea : tareas) {

            if (tarea.isCompletada()) {
                contador++;
            }
        }

        return contador;
    }

    public double calcularHorasPendientes() {

        double suma = 0;

        for (Tarea tarea : tareas) {

            if (!tarea.isCompletada()) {
                suma += tarea.getHoras();
            }
        }

        return suma;
    }

    public String mostrarTareas() {

        String resultado = "";

        for (Tarea tarea : tareas) {

            resultado += tarea.mostrarInformacion() + "\n";
        }

        if (resultado.equals("")) {
            return "El sprint no tiene tareas registradas.";
        }

        return resultado;
    }

}
