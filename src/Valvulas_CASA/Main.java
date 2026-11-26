package Valvulas_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear seis válvulas
        Valvula v1 = new Valvula("V001", 40, 80, true);
        Valvula v2 = new Valvula("V002", 65, 120, true);
        Valvula v3 = new Valvula("V003", 90, 150, false);
        Valvula v4 = new Valvula("V004", 75, 100, true);
        Valvula v5 = new Valvula("V005", 30, 200, false);
        Valvula v6 = new Valvula("V006", 85, 180, true);

        // Crear arreglo
        Valvula[] valvulas = {v1, v2, v3, v4, v5, v6};

        // Crear analizador
        AnalizadorValvulas analizador =
                new AnalizadorValvulas(valvulas);

        // Mostrar válvulas
        System.out.println("===== VALVULAS INDUSTRIALES =====");

        for (Valvula valvula : valvulas) {
            System.out.println(valvula.mostrarInformacion());
        }

        // Contar activas
        System.out.println("\n===== VALVULAS ACTIVAS =====");
        System.out.println("Cantidad: "
                + analizador.contarActivas());

        // Apertura promedio
        System.out.println("\n===== APERTURA PROMEDIO =====");
        System.out.println("Promedio: "
                + analizador.calcularAperturaPromedio()
                + "%");

        // Buscar válvula existente
        System.out.println("\n===== BUSCAR VALVULA =====");

        Valvula encontrada = analizador.buscarPorCodigo("V003");

        if (encontrada != null) {
            System.out.println(encontrada.mostrarInformacion());
        } else {
            System.out.println("Válvula no encontrada");
        }

        // Buscar válvula inexistente
        Valvula inexistente = analizador.buscarPorCodigo("V010");

        if (inexistente == null) {
            System.out.println("V010 no existe");
        }

        // Mayor presión
        System.out.println("\n===== MAYOR PRESION =====");

        Valvula mayor = analizador.obtenerMayorPresion();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        }

        // Desafío
        System.out.println("\n===== VALVULAS CON APERTURA MAYOR A 60% =====");

        System.out.println(
                analizador.listarPorAperturaMayor(60)
        );
    }
}
