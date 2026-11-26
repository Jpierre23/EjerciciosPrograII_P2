package Notificaciones_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear notificaciones fuera del gestor
        Notificacion n1 = new NotificacionEmail(
                "usuario@gmail.com",
                "Su cuenta ha sido actualizada"
        );

        Notificacion n2 = new NotificacionSMS(
                "0991234567",
                "Su código de verificación es 1234"
        );

        Notificacion n3 = new NotificacionPush(
                "usuario01",
                "Tiene una nueva actualización"
        );

        Notificacion n4 = new NotificacionSlack(
                "Equipo de desarrollo",
                "La reunión comenzará en 10 minutos"
        );

        // Crear gestor
        GestorNotificaciones gestor = new GestorNotificaciones();

        // Agregar notificaciones
        gestor.agregarNotificacion(n1);
        gestor.agregarNotificacion(n2);
        gestor.agregarNotificacion(n3);
        gestor.agregarNotificacion(n4);

        // Mostrar todas las notificaciones
        System.out.println(gestor.mostrarNotificaciones());

        // Mostrar cantidad
        System.out.println("Cantidad de notificaciones: "
                + gestor.cantidadNotificaciones());
    }
}
