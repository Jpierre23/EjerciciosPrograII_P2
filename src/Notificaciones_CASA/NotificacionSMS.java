package Notificaciones_CASA;

public class NotificacionSMS extends Notificacion {

    private String numeroTelefono;

    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
        this.numeroTelefono = destinatario;
    }

    @Override
    public String generarMensaje() {
        return "SMS\n" +
                "Número: " + numeroTelefono + "\n" +
                "Mensaje: " + getMensaje();
    }
}
