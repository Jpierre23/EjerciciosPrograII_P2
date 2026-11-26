package Pedido_Detalles_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear productos fuera del pedido
        Producto p1 = new Producto("P001", "Teclado", 25);
        Producto p2 = new Producto("P002", "Mouse", 12);
        Producto p3 = new Producto("P003", "Monitor", 150);
        Producto p4 = new Producto("P004", "Audifonos", 30);

        // Crear pedido
        Pedido pedido = new Pedido();

        // Agregar productos
        pedido.agregarProducto(p1, 2);
        pedido.agregarProducto(p2, 1);
        pedido.agregarProducto(p3, 1);
        pedido.agregarProducto(p4, 2);

        // Agregar nuevamente un producto existente
        pedido.agregarProducto(p1, 1);

        // Mostrar resumen
        System.out.println(pedido.mostrarResumen());

        // Consultar cantidad de detalles
        System.out.println("\n===== CANTIDAD DE DETALLES =====");
        System.out.println("Detalles: " + pedido.cantidadDetalles());

        // Probar eliminación inválida
        System.out.println("\n===== ELIMINAR DETALLE INVALIDO =====");

        boolean eliminadoInvalido = pedido.eliminarDetalle(10);

        System.out.println("¿Se eliminó?: " + eliminadoInvalido);

        // Eliminar detalle válido
        System.out.println("\n===== ELIMINAR DETALLE VALIDO =====");

        boolean eliminado = pedido.eliminarDetalle(1);

        System.out.println("¿Se eliminó?: " + eliminado);

        // Mostrar pedido actualizado
        System.out.println("\n===== PEDIDO ACTUALIZADO =====");
        System.out.println(pedido.mostrarResumen());
    }
}
