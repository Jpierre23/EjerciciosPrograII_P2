package Usuarios_Sistema;

public class Main {
    public static void main(String[] args) {

        // Crear usuarios fuera del sistema
        Usuario u1 = new Administrador(
                "admin1", "admin@demo.com"
        );

        Usuario u2 = new Desarrollador(
                "dev1", "dev@demo.com"
        );

        Usuario u3 = new Cliente(
                "cliente1", "cliente@demo.com"
        );

        Usuario u4 = new Soporte(
                "soporte1", "soporte@demo.com"
        );

        // Crear sistema
        SistemaUsuarios sistema = new SistemaUsuarios();

        // Agregar usuarios
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);

        // Mostrar todos los usuarios
        System.out.println("===== USUARIOS DEL SISTEMA =====");
        System.out.println(sistema.mostrarUsuarios());

        // Consultar permisos
        System.out.println("===== PERMISOS =====");
        System.out.println("Administrador: "
                + u1.obtenerPermisos());

        System.out.println("Desarrollador: "
                + u2.obtenerPermisos());

        System.out.println("Cliente: "
                + u3.obtenerPermisos());

        System.out.println("Soporte: "
                + u4.obtenerPermisos());

        // Buscar usuario
        System.out.println("\n===== BUSCAR USUARIO =====");

        Usuario encontrado = sistema.buscarUsuario("dev1");

        if (encontrado != null) {
            System.out.println("Usuario encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Usuario no encontrado");
        }

        // Buscar usuario inexistente
        Usuario inexistente = sistema.buscarUsuario("usuario10");

        if (inexistente == null) {
            System.out.println("usuario10 no existe");
        }

        // Eliminar usuario
        System.out.println("\n===== ELIMINAR USUARIO =====");

        boolean eliminado = sistema.eliminarUsuario("cliente1");

        if (eliminado) {
            System.out.println("Cliente eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el cliente");
        }

        // Mostrar usuarios después de eliminar
        System.out.println("\n===== USUARIOS ACTUALES =====");
        System.out.println(sistema.mostrarUsuarios());
    }
}
