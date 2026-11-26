package Empleados_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear empleados fuera de la empresa
        Empleado e1 = new Programador("E001", "Ana", 1200);
        Empleado e2 = new Tester("E002", "Luis", 1000);
        Empleado e3 = new Disenador("E003", "Carlos", 900);
        Empleado e4 = new ArquitectoSoftware(
                "E004", "Maria", 2000);

        // Crear empresa
        EmpresaSoftware empresa = new EmpresaSoftware();

        // Agregar empleados
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        // Mostrar empleados
        System.out.println(empresa.mostrarEmpleados());

        // Mostrar total de bonos
        System.out.println("===== TOTAL DE BONOS =====");
        System.out.println("Total: $"
                + empresa.calcularTotalBonos());
    }
}
