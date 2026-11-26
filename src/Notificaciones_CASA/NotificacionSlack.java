package Notificaciones_CASA;

public class NotificacionSlack extends Notificacion {

    private String canal;

    public NotificacionSlack(String destinatario, String mensaje) {
        super(destinatario, mensaje);
        this.canal = "#general";
    }

    @Override
    public String generarMensaje() {
        return "NOTIFICACIÓN SLACK\n" +
                "Destinatario: " + getDestinatario() + "\n" +
                "Canal: " + canal + "\n" +
                "Mensaje: " + getMensaje();
    }
}
