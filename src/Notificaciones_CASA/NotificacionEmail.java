package Notificaciones_CASA;

public class NotificacionEmail extends Notificacion {

    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje) {
        super(destinatario, mensaje);
        this.asunto = "Notificación del sistema";
    }

    @Override
    public String generarMensaje() {
        return "EMAIL\n" +
                "Para: " + getDestinatario() + "\n" +
                "Asunto: " + asunto + "\n" +
                "Mensaje: " + getMensaje();
    }
}
