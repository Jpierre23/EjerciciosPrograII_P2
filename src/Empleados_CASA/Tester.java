package Empleados_CASA;

public class Tester extends Empleado {

    private String especialidad;

    public Tester(String identificacion, String nombre,
                  double salarioBase) {
        super(identificacion, nombre, salarioBase);
        this.especialidad = "Pruebas de software";
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.12;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Cargo: Tester" +
                " | Especialidad: " + especialidad +
                " | Bono: $" + calcularBono();
    }
}
