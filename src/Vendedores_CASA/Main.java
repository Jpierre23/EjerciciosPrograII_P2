package Vendedores_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear cinco vendedores fuera del equipo
        Vendedor v1 = new Vendedor("V001", "Ana", 1200);
        Vendedor v2 = new Vendedor("V002", "Luis", 1800);
        Vendedor v3 = new Vendedor("V003", "Carlos", 950);
        Vendedor v4 = new Vendedor("V004", "Maria", 2100);
        Vendedor v5 = new Vendedor("V005", "Pedro", 1500);

        // Crear equipo
        EquipoVentas equipo = new EquipoVentas();

        // Agregar vendedores
        System.out.println("===== AGREGAR VENDEDORES =====");

        System.out.println(equipo.agregarVendedor(v1));
        System.out.println(equipo.agregarVendedor(v2));
        System.out.println(equipo.agregarVendedor(v3));
        System.out.println(equipo.agregarVendedor(v4));
        System.out.println(equipo.agregarVendedor(v5));

        // Mostrar vendedores
        System.out.println("\n" + equipo.mostrarVendedores());

        // Probar vendedor duplicado
        System.out.println("===== PROBAR DUPLICADOS =====");

        Vendedor duplicado =
                new Vendedor("V001", "Ana Nueva", 3000);

        System.out.println("¿Se agregó el duplicado?: "
                + equipo.agregarVendedor(duplicado));

        // Buscar vendedor
        System.out.println("\n===== BUSCAR VENDEDOR =====");

        Vendedor encontrado = equipo.buscarVendedor("V004");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Vendedor no encontrado");
        }

        // Buscar vendedor inexistente
        Vendedor inexistente = equipo.buscarVendedor("V010");

        if (inexistente == null) {
            System.out.println("V010 no existe");
        }

        // Calcular ventas totales
        System.out.println("\n===== VENTAS TOTALES =====");

        System.out.println("Total: $"
                + equipo.calcularVentasTotales());

        // Obtener mayor vendedor
        System.out.println("\n===== MAYOR VENDEDOR =====");

        Vendedor mayor = equipo.obtenerMayorVendedor();

        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        }

        // Eliminar vendedor
        System.out.println("\n===== ELIMINAR VENDEDOR =====");

        boolean eliminado = equipo.eliminarVendedor("V003");

        System.out.println("¿Se eliminó?: " + eliminado);

        // Probar eliminación inexistente
        boolean eliminadoInvalido = equipo.eliminarVendedor("V010");

        System.out.println("¿Se eliminó V010?: " + eliminadoInvalido);

        // Mostrar equipo actualizado
        System.out.println("\n===== EQUIPO ACTUALIZADO =====");

        System.out.println(equipo.mostrarVendedores());

        System.out.println("Cantidad de vendedores: "
                + equipo.cantidadVendedores());

        System.out.println("Ventas totales actualizadas: $"
                + equipo.calcularVentasTotales());
    }
}
