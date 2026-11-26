package Motores_CASA;

public class AnalizadorMotores {

    private Motor[] motores;

    // Constructor
    public AnalizadorMotores(Motor[] motores) {
        this.motores = motores;
    }

    // Contar motores encendidos
    public int contarEncendidos() {
        int contador = 0;

        for (Motor motor : motores) {
            if (motor != null && motor.isEncendido()) {
                contador++;
            }
        }

        return contador;
    }

    // Calcular velocidad promedio
    public double calcularVelocidadPromedio() {
        double suma = 0;
        int contador = 0;

        for (Motor motor : motores) {
            if (motor != null) {
                suma += motor.getVelocidad();
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return suma / contador;
    }

    // Buscar motor por código
    public Motor buscarPorCodigo(String codigo) {
        for (Motor motor : motores) {
            if (motor != null &&
                    motor.getCodigo().equals(codigo)) {
                return motor;
            }
        }

        return null;
    }

    // Obtener motor con mayor potencia
    public Motor obtenerMayorPotencia() {
        Motor mayor = null;

        for (Motor motor : motores) {
            if (motor != null) {
                if (mayor == null ||
                        motor.getPotencia() > mayor.getPotencia()) {
                    mayor = motor;
                }
            }
        }

        return mayor;
    }

    // DESAFÍO: Motor encendido con mayor velocidad
    public Motor obtenerMotorEncendidoMayorVelocidad() {
        Motor mayor = null;

        for (Motor motor : motores) {
            if (motor != null && motor.isEncendido()) {
                if (mayor == null ||
                        motor.getVelocidad() > mayor.getVelocidad()) {
                    mayor = motor;
                }
            }
        }

        return mayor;
    }
}
