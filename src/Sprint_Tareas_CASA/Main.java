package Sprint_Tareas_CASA;


public class Main {

    public static void main(String[] args) {

        // Crear sprint
        Sprint sprint = new Sprint();

        System.out.println("===== CREAR TAREAS =====");

        System.out.println(sprint.crearTarea(
                "T01", "Disenar interfaz", 5));

        System.out.println(sprint.crearTarea(
                "T02", "Crear base de datos", 8));

        System.out.println(sprint.crearTarea(
                "T03", "Implementar login", 12));

        System.out.println(sprint.crearTarea(
                "T04", "Desarrollar inventario", 10));

        System.out.println(sprint.crearTarea(
                "T05", "Realizar pruebas", 6));

        System.out.println("\n===== TAREAS DEL SPRINT =====");

        System.out.println(sprint.mostrarTareas());

        System.out.println("===== COMPLETAR TAREAS =====");

        System.out.println("T01: " +
                sprint.completarTarea("T01"));

        System.out.println("T03: " +
                sprint.completarTarea("T03"));

        System.out.println("\n===== BUSCAR TAREA EXISTENTE =====");

        Tarea encontrada = sprint.buscarTarea("T02");

        if (encontrada != null) {
            System.out.println(encontrada.mostrarInformacion());
        } else {
            System.out.println("Tarea no encontrada");
        }

        System.out.println("===== BUSCAR TAREA INEXISTENTE =====");

        Tarea inexistente = sprint.buscarTarea("T10");

        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("Tarea no encontrada");
        }

        System.out.println("===== TAREAS COMPLETADAS =====");

        System.out.println(
                "Total: " + sprint.contarCompletadas());

        System.out.println("\n===== HORAS PENDIENTES =====");

        System.out.println(
                "Horas: " + sprint.calcularHorasPendientes());

        System.out.println("\n===== PROBAR CODIGO DUPLICADO =====");

        boolean duplicada = sprint.crearTarea(
                "T01", "Otra tarea", 4);

        if (duplicada) {
            System.out.println("Tarea registrada");
        } else {
            System.out.println("Error: el codigo ya existe");
        }

        // 9. Mostrar estado final
        System.out.println("\n===== ESTADO FINAL DEL SPRINT =====");

        System.out.println(sprint.mostrarTareas());
    }
}

