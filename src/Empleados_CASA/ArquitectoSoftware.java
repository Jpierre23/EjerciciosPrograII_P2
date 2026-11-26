package Empleados_CASA;

public class ArquitectoSoftware extends Empleado {

    private String arquitectura;

    public ArquitectoSoftware(String identificacion, String nombre,
                              double salarioBase) {
        super(identificacion, nombre, salarioBase);
        this.arquitectura = "Microservicios";
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.20;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Cargo: Arquitecto de software" +
                " | Arquitectura: " + arquitectura +
                " | Bono: $" + calcularBono();
    }
}
