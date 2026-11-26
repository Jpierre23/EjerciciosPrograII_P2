package Vendedores_CASA;
import java.util.ArrayList;

public class EquipoVentas {

    private ArrayList<Vendedor> vendedores;

    // Constructor
    public EquipoVentas() {
        vendedores = new ArrayList<>();
    }

    // Agregar vendedor evitando identificaciones duplicadas
    public boolean agregarVendedor(Vendedor vendedor) {

        if (buscarVendedor(vendedor.getIdentificacion()) != null) {
            return false;
        }

        vendedores.add(vendedor);
        return true;
    }

    // Buscar vendedor por identificación
    public Vendedor buscarVendedor(String identificacion) {

        for (Vendedor vendedor : vendedores) {

            if (vendedor.getIdentificacion()
                    .equals(identificacion)) {
                return vendedor;
            }
        }

        return null;
    }

    // Eliminar vendedor por identificación
    public boolean eliminarVendedor(String identificacion) {

        Vendedor vendedor = buscarVendedor(identificacion);

        if (vendedor != null) {
            vendedores.remove(vendedor);
            return true;
        }

        return false;
    }

    // Calcular ventas totales
    public double calcularVentasTotales() {
        double total = 0;

        for (Vendedor vendedor : vendedores) {
            total += vendedor.getVentas();
        }

        return total;
    }

    // Obtener vendedor con mayores ventas
    public Vendedor obtenerMayorVendedor() {

        Vendedor mayor = null;

        for (Vendedor vendedor : vendedores) {

            if (mayor == null ||
                    vendedor.getVentas() > mayor.getVentas()) {
                mayor = vendedor;
            }
        }

        return mayor;
    }

    // Mostrar vendedores
    public String mostrarVendedores() {

        String resultado = "===== EQUIPO DE VENTAS =====\n";

        for (Vendedor vendedor : vendedores) {
            resultado += vendedor.mostrarInformacion() + "\n";
        }

        return resultado;
    }

    // Obtener cantidad de vendedores
    public int cantidadVendedores() {
        return vendedores.size();
    }
}
