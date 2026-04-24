package src.decorator;

public class Logging extends ExtensionDecorator {

    public Logging(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public String getDescription() {
        return notificacion.getDescription() + " + Logging";
    }

    @Override
    public void enviarNotificacion(String estado) {
        System.out.println("[LOG] Se ha hecho una accion con estado: " + estado);
        notificacion.enviarNotificacion(estado);
    }
}