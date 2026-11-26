package Analisis_Modulos;


public class Main {

    public static void main(String[] args) {

        // Crear arreglo de cinco módulos
        Modulo[] modulos = new Modulo[5];

        // Crear los módulos
        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Usuarios", "Python", 100, true);
        modulos[3] = new Modulo("Reportes", "Java", 40, false);
        modulos[4] = new Modulo("Interfaz", "JavaScript", 20, false);

        // Crear analizador asociado al arreglo
        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

        // 1. Listar módulos
        System.out.println("===== LISTADO DE MODULOS =====");
        System.out.println(analizador.listarModulos());

        // 2. Contar módulos terminados
        System.out.println("===== MODULOS TERMINADOS =====");
        System.out.println("Total: " + analizador.contarTerminados());

        // 3. Calcular progreso promedio
        System.out.println("\n===== PROGRESO PROMEDIO =====");
        System.out.println("Promedio: " +
                analizador.calcularProgresoPromedio() + "%");

        // 4. Buscar módulo existente
        System.out.println("\n===== BUSCAR MODULO =====");

        Modulo encontrado = analizador.buscarModulo("Autenticación");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Modulo no encontrado");
        }

        // 5. Buscar módulo inexistente
        System.out.println("===== BUSCAR MODULO INEXISTENTE =====");

        Modulo inexistente = analizador.buscarModulo("Facturación");

        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("Modulo no encontrado");
        }

        // 6. Desafío adicional
        System.out.println("===== MODULO CON MENOR PROGRESO =====");

        Modulo menor = analizador.obtenerMenorProgreso();

        if (menor != null) {
            System.out.println(menor.mostrarInformacion());
        } else {
            System.out.println("No existen módulos");
        }
    }
}
