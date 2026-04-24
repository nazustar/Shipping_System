package src.decorator;

public abstract class Notificacion {
    protected String description;

    public abstract String getDescription();
    // Método para enviar notificaciones.
    public abstract void enviarNotificacion(String mensaje);
}