package Motores_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear cinco motores
        Motor m1 = new Motor("M001", 10, 1200, true);
        Motor m2 = new Motor("M002", 15, 1500, false);
        Motor m3 = new Motor("M003", 20, 1800, true);
        Motor m4 = new Motor("M004", 12, 1400, true);
        Motor m5 = new Motor("M005", 25, 2000, false);

        // Crear arreglo
        Motor[] motores = {m1, m2, m3, m4, m5};

        // Crear analizador
        AnalizadorMotores analizador =
                new AnalizadorMotores(motores);

        // Mostrar motores
        System.out.println("===== MOTORES INDUSTRIALES =====");

        for (Motor motor : motores) {
            System.out.println(motor.mostrarInformacion());
        }

        // Contar encendidos
        System.out.println("\n===== MOTORES ENCENDIDOS =====");
        System.out.println("Cantidad: "
                + analizador.contarEncendidos());

        // Velocidad promedio
        System.out.println("\n===== VELOCIDAD PROMEDIO =====");
        System.out.println("Promedio: "
                + analizador.calcularVelocidadPromedio()
                + " RPM");

        // Buscar motor existente
        System.out.println("\n===== BUSCAR MOTOR =====");

        Motor encontrado = analizador.buscarPorCodigo("M003");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Motor no encontrado");
        }

        // Buscar motor inexistente
        Motor inexistente = analizador.buscarPorCodigo("M010");

        if (inexistente == null) {
            System.out.println("M010 no existe");
        }

        // Mayor potencia
        System.out.println("\n===== MAYOR POTENCIA =====");

        Motor mayor = analizador.obtenerMayorPotencia();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        }

        // Desafío
        System.out.println("\n===== MOTOR ENCENDIDO MÁS RÁPIDO =====");

        Motor rapido =
                analizador.obtenerMotorEncendidoMayorVelocidad();

        if (rapido != null) {
            System.out.println(rapido.mostrarInformacion());
        } else {
            System.out.println("No hay motores encendidos");
        }
    }
}
