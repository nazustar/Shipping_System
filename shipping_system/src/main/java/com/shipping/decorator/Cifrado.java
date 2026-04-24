package com.shipping.decorator;

public class Cifrado extends ExtensionDecorator {

    public Cifrado(Notificacion notificacion) {
        super(notificacion);
    }
    
    @Override
    public String getDescription() {
        return notificacion.getDescription();
    }

    @Override
        public void enviarNotificacion(String estado) {
            System.out.println("Cifrando notificacion...");
            notificacion.enviarNotificacion(estado);
        }
    
}
