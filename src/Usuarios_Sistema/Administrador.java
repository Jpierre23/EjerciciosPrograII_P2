package Usuarios_Sistema;


public class Administrador extends Usuario {

    private int nivelAdministracion;

    public Administrador(String username, String correo) {
        super(username, correo);
        this.nivelAdministracion = 3;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos completos: gestionar usuarios, "
                + "configurar el sistema y administrar información";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Administrador" +
                " | Nivel: " + nivelAdministracion;
    }
}
