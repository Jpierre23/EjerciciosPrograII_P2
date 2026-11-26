package Pedido_Detalles_CASA;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<DetallePedido> detalles;

    // Constructor
    public Pedido() {
        detalles = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto, int cantidad) {

        // Verificar si el producto ya existe
        for (DetallePedido detalle : detalles) {

            if (detalle.getProducto().getCodigo()
                    .equals(producto.getCodigo())) {

                detalle.agregarCantidad(cantidad);
                return;
            }
        }

        // Si no existe, crear un nuevo detalle
        DetallePedido nuevoDetalle =
                new DetallePedido(producto, cantidad);

        detalles.add(nuevoDetalle);
    }

    // Calcular total del pedido
    public double calcularTotal() {
        double total = 0;

        for (DetallePedido detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    // Cantidad de detalles
    public int cantidadDetalles() {
        return detalles.size();
    }

    // Eliminar detalle por posición
    public boolean eliminarDetalle(int posicion) {

        if (posicion >= 0 && posicion < detalles.size()) {
            detalles.remove(posicion);
            return true;
        }

        return false;
    }

    // Mostrar resumen
    public String mostrarResumen() {
        String resultado = "===== RESUMEN DEL PEDIDO =====\n";

        for (int i = 0; i < detalles.size(); i++) {
            resultado += (i + 1) + ". " +
                    detalles.get(i).mostrarInformacion() +
                    "\n";
        }

        resultado += "Cantidad de detalles: " + cantidadDetalles();
        resultado += "\nTotal del pedido: $" + calcularTotal();

        return resultado;
    }
}
