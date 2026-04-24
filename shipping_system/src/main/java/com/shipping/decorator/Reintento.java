package com.shipping.decorator;

public class Reintento extends ExtensionDecorator {

    private int intentos;

    public Reintento(Notificacion notificacion, int intentos) {
        super(notificacion);
        this.intentos = intentos;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void enviarNotificacion(String estado) {
        intentos++;
        description = getDescription() + " Sea han realizado " + intentos + " intentos";
        notificacion.enviarNotificacion(estado);
    }
    
}
