package Empleados_CASA;

public class Empleado {

    private String identificacion;
    private String nombre;
    private double salarioBase;

    public Empleado(String identificacion, String nombre,
                    double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método general
    public double calcularBono() {
        return 0;
    }

    public String mostrarInformacion() {
        return "ID: " + identificacion +
                " | Nombre: " + nombre +
                " | Salario: $" + salarioBase;
    }
}
