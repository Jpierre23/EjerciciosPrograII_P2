package Usuarios_Sistema;


import java.util.ArrayList;

public class SistemaUsuarios {

    private ArrayList<Usuario> usuarios;

    // Constructor
    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    // Agregar cualquier tipo de usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Buscar usuario por username
    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }

        return null;
    }

    // Eliminar usuario
    public boolean eliminarUsuario(String username) {
        Usuario usuario = buscarUsuario(username);

        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }

        return false;
    }

    // Mostrar todos los usuarios
    public String mostrarUsuarios() {
        String resultado = "";

        for (Usuario usuario : usuarios) {
            resultado += usuario.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}
