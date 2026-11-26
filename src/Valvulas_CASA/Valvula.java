package Valvulas_CASA;

public class Valvula {

    private String codigo;
    private double apertura;
    private double presion;
    private boolean activa;

    // Constructor
    public Valvula(String codigo, double apertura,
                   double presion, boolean activa) {
        this.codigo = codigo;
        this.apertura = apertura;
        this.presion = presion;
        this.activa = activa;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public double getApertura() {
        return apertura;
    }

    public double getPresion() {
        return presion;
    }

    public boolean isActiva() {
        return activa;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return "Código: " + codigo +
                " | Apertura: " + apertura + "%" +
                " | Presión: " + presion + " PSI" +
                " | Activa: " + activa;
    }
}
