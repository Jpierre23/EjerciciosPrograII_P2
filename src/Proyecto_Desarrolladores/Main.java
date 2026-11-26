package Proyecto_Desarrolladores;


public class Main {

    public static void main(String[] args) {

        // PASO 1: Crear desarrolladores fuera del proyecto
        Desarrollador d1 = new Desarrollador(
                "D01", "Ana", "Backend", 20);

        Desarrollador d2 = new Desarrollador(
                "D02", "Luis", "Frontend", 15);

        Desarrollador d3 = new Desarrollador(
                "D03", "Carlos", "Base de datos", 25);

        // PASO 2: Crear proyecto
        Proyecto proyecto = new Proyecto("Sistema de ventas");

        // Comprobar que inicialmente esta vacio
        System.out.println("===== PROYECTO INICIALMENTE VACIO =====");

        System.out.println(proyecto.mostrarEquipo());

        // PASO 3: Agregar desarrolladores existentes
        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        // Mostrar equipo
        System.out.println("\n===== EQUIPO DEL PROYECTO =====");

        System.out.println(proyecto.mostrarEquipo());

        // PASO 4: Buscar desarrollador existente
        System.out.println("===== BUSCAR DESARROLLADOR EXISTENTE =====");

        Desarrollador encontrado =
                proyecto.buscarDesarrollador("D02");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Desarrollador no encontrado");
        }

        // Buscar desarrollador inexistente
        System.out.println("===== BUSCAR DESARROLLADOR INEXISTENTE =====");

        Desarrollador inexistente =
                proyecto.buscarDesarrollador("D10");

        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("Desarrollador no encontrado");
        }

        // PASO 5: Eliminar desarrollador
        System.out.println("===== ELIMINAR DESARROLLADOR =====");

        boolean eliminado = proyecto.eliminarDesarrollador("D02");

        if (eliminado) {
            System.out.println("Desarrollador eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el desarrollador");
        }

        // Comprobar equipo despues de eliminar
        System.out.println("\n===== EQUIPO ACTUALIZADO =====");

        System.out.println(proyecto.mostrarEquipo());

        // PASO 6: Calcular horas totales
        System.out.println("===== HORAS TOTALES =====");

        System.out.println(
                "Total de horas: " + proyecto.calcularTotalHoras());

        // DESAFIO: Desarrollador con mayor carga
        System.out.println("\n===== MAYOR CARGA DE TRABAJO =====");

        Desarrollador mayor = proyecto.obtenerMayorCarga();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        } else {
            System.out.println("No existen desarrolladores");
        }

        // Comprobar que d2 sigue existiendo fuera del proyecto
        System.out.println("===== DESARROLLADOR ELIMINADO DEL PROYECTO =====");

        System.out.println(d2.mostrarInformacion());
    }
}
