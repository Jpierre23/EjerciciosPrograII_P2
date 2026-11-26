package Pedido_Detalles_CASA;

public class DetallePedido {

    private Producto producto;
    private int cantidad;

    // Constructor
    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Acumular cantidad
    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    // Calcular subtotal
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Mostrar información
    public String mostrarInformacion() {
        return producto.getNombre() +
                " | Cantidad: " + cantidad +
                " | Precio unitario: $" + producto.getPrecio() +
                " | Subtotal: $" + calcularSubtotal();
    }
}
