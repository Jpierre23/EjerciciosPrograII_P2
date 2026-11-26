package Tareas_de_desarrollo_CASA;


public class Main {

    public static void main(String[] args) {

        // Crear arreglo de seis tareas
        Tarea[] tareas = new Tarea[6];

        // Crear las tareas
        tareas[0] = new Tarea("T01", "Diseñar interfaz", 5, true);
        tareas[1] = new Tarea("T02", "Crear base de datos", 8, true);
        tareas[2] = new Tarea("T03", "Implementar login", 12, false);
        tareas[3] = new Tarea("T04", "Desarrollar inventario", 10, false);
        tareas[4] = new Tarea("T05", "Realizar pruebas", 6, true);
        tareas[5] = new Tarea("T06", "Documentar proyecto", 4, false);

        // Crear analizador
        AnalizadorTareas analizador = new AnalizadorTareas(tareas);

        // Contar tareas completadas
        System.out.println("===== TAREAS COMPLETADAS =====");
        System.out.println("Total: " + analizador.contarCompletadas());

        // Calcular horas totales
        System.out.println("\n===== HORAS TOTALES =====");
        System.out.println("Horas: " + analizador.calcularHorasTotales());

        // Buscar tarea existente
        System.out.println("\n===== BUSCAR TAREA EXISTENTE =====");

        Tarea encontrada = analizador.buscarPorCodigo("T03");

        if (encontrada != null) {
            System.out.println(encontrada.mostrarInformacion());
        } else {
            System.out.println("Tarea no encontrada");
        }

        // Buscar tarea inexistente
        System.out.println("===== BUSCAR TAREA INEXISTENTE =====");

        Tarea inexistente = analizador.buscarPorCodigo("T10");

        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("Tarea no encontrada");
        }

        // Obtener tarea de mayor duracion
        System.out.println("===== TAREA DE MAYOR DURACION =====");

        Tarea mayor = analizador.obtenerTareaMayorDuracion();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        } else {
            System.out.println("No existen tareas");
        }

        // Porcentaje de tareas completadas
        System.out.println("===== PORCENTAJE COMPLETADO =====");

        System.out.println(
                "Porcentaje: " +
                        analizador.calcularPorcentajeCompletadas() + "%"
        );
    }
}

