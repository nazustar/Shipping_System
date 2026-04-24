package src.decorator;

// Componente concreto.
public class NotificacionBase extends Notificacion {

    @Override
    public String getDescription() {
        return "NotificacionBase";
    }

    // Implementacion del metodo para enviar notificaciones.
    // Este es el metodo que se va a decorar, conectado al observer.
    
    @Override
    public void enviarNotificacion(String estado) {
        System.out.println("Notificacion recibida: " + estado);
    }
}