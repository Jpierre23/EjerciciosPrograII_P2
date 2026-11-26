package Usuarios_Sistema;


public class Desarrollador extends Usuario {

    private String especialidad;

    public Desarrollador(String username, String correo) {
        super(username, correo);
        this.especialidad = "Desarrollo de software";
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos para desarrollar, modificar código "
                + "y consultar proyectos";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Desarrollador" +
                " | Especialidad: " + especialidad;
    }
}
