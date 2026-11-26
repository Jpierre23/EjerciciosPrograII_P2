package Notificaciones_CASA;
import java.util.ArrayList;

public class GestorNotificaciones {

    private ArrayList<Notificacion> notificaciones;

    public GestorNotificaciones() {
        notificaciones = new ArrayList<>();
    }

    public void agregarNotificacion(Notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public String mostrarNotificaciones() {
        String resultado = "===== NOTIFICACIONES =====\n";

        for (Notificacion notificacion : notificaciones) {
            resultado += notificacion.generarMensaje() + "\n\n";
        }

        return resultado;
    }

    public int cantidadNotificaciones() {
        return notificaciones.size();
    }
}
