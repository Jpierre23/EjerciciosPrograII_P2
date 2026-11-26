package Notificaciones_CASA;

public class NotificacionPush extends Notificacion {

    private String aplicacion;

    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
        this.aplicacion = "App Sistema";
    }

    @Override
    public String generarMensaje() {
        return "NOTIFICACIÓN PUSH\n" +
                "Usuario: " + getDestinatario() + "\n" +
                "Aplicación: " + aplicacion + "\n" +
                "Mensaje: " + getMensaje();
    }
}
