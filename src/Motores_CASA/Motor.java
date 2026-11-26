package Motores_CASA;

public class Motor {

    private String codigo;
    private double potencia;
    private double velocidad;
    private boolean encendido;

    // Constructor
    public Motor(String codigo, double potencia,
                 double velocidad, boolean encendido) {
        this.codigo = codigo;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Código: " + codigo +
                " | Potencia: " + potencia + " HP" +
                " | Velocidad: " + velocidad + " RPM" +
                " | Encendido: " + encendido;
    }
}
