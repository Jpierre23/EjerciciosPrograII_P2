package Empleados_CASA;

public class Disenador extends Empleado {

    private String herramienta;

    public Disenador(String identificacion, String nombre,
                     double salarioBase) {
        super(identificacion, nombre, salarioBase);
        this.herramienta = "Figma";
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.10;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Cargo: Diseñador" +
                " | Herramienta: " + herramienta +
                " | Bono: $" + calcularBono();
    }
}
