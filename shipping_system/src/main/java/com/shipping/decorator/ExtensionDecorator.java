package com.shipping.decorator;

// Componente de decorador.
public abstract class ExtensionDecorator extends Notificacion {

    protected Notificacion notificacion;

    public ExtensionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public String getDescription() {
        return notificacion.getDescription();
    }

    @Override
    public void enviarNotificacion(String estado) {
        notificacion.enviarNotificacion (estado);
    }
}