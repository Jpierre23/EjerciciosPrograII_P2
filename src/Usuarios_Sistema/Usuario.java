package Usuarios_Sistema;


public class Usuario {

    // Atributos comunes
    private String username;
    private String correo;

    // Constructor
    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    // Permisos generales
    public String obtenerPermisos() {
        return "Permisos básicos del sistema";
    }

    // Información general
    public String mostrarInformacion() {
        return "Username: " + username +
                " | Correo: " + correo;
    }
}
