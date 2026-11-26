package Empleados_CASA;

public class Programador extends Empleado {

    private String lenguaje;

    public Programador(String identificacion, String nombre,
                       double salarioBase) {
        super(identificacion, nombre, salarioBase);
        this.lenguaje = "Java";
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Cargo: Programador" +
                " | Lenguaje: " + lenguaje +
                " | Bono: $" + calcularBono();
    }
}
