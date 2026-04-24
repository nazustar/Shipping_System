package src.decorator;

public class Logging extends ExtensionDecorator {

    public Logging(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
        public void enviarNotificacion(String estado) {
        description = getDescription() + " Se ha hecho una accion \n";
        notificacion.enviarNotificacion(estado);
    }
    
}
