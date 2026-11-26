package Empleados_CASA;
import java.util.ArrayList;

public class EmpresaSoftware {

    private ArrayList<Empleado> empleados;

    public EmpresaSoftware() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularTotalBonos() {
        double total = 0;

        for (Empleado empleado : empleados) {
            total += empleado.calcularBono();
        }

        return total;
    }

    public String mostrarEmpleados() {
        String resultado = "===== EMPLEADOS =====\n";

        for (Empleado empleado : empleados) {
            resultado += empleado.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}
