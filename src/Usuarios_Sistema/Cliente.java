package Usuarios_Sistema;

public class Cliente extends Usuario {

    private String tipoCuenta;

    public Cliente(String username, String correo) {
        super(username, correo);
        this.tipoCuenta = "Estándar";
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos limitados: consultar servicios "
                + "y gestionar su propia cuenta";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Cliente" +
                " | Cuenta: " + tipoCuenta;
    }
}
