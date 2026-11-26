package Usuarios_Sistema;


public class Soporte extends Usuario {

    private String areaSoporte;

    public Soporte(String username, String correo) {
        super(username, correo);
        this.areaSoporte = "Soporte técnico";
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos para atender solicitudes, "
                + "resolver problemas y brindar asistencia técnica";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Soporte" +
                " | Área: " + areaSoporte;
    }
}
