package src.decorator;

public class Cifrado extends ExtensionDecorator {

    public Cifrado(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public String getDescription() {
        return notificacion.getDescription() + " + Cifrado";
    }

    // Mejora del cifrado.
    @Override
    public void enviarNotificacion(String estado) {
        String cifrado = java.util.Base64.getEncoder().encodeToString(estado.getBytes());
        System.out.println("[CIFRADO] Mensaje cifrado: " + cifrado);
        notificacion.enviarNotificacion(cifrado);
    }
}