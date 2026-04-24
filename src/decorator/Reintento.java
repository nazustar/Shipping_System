package src.decorator;

public class Reintento extends ExtensionDecorator {

    private int intentos;

    public Reintento(Notificacion notificacion, int intentos) {
        super(notificacion);
        this.intentos = intentos;
    }

    @Override
    public String getDescription() {
        return notificacion.getDescription() + " + Reintento(x" + intentos + ")";
    }

    @Override
    public void enviarNotificacion(String estado) {
        // Reintenta la notificacion el número de veces indicado.
        for (int i = 1; i <= intentos; i++) {
            System.out.println("[REINTENTO] Intento " + i + " de " + intentos);
            notificacion.enviarNotificacion(estado);
        }
    }
}