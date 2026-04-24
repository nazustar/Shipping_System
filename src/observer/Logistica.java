package src.observer;

import src.decorator.Notificacion;

public class Logistica implements Observer {

    private Notificacion notificacion;

    public Logistica(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void actualizar(String estado) {
        // Logistica recibe el estado del pedido.
        System.out.println("Logistica notificada: " + estado);

        // Luego envia una notificacion al cliente.
        notificacion.enviarNotificacion(estado);
    }
}