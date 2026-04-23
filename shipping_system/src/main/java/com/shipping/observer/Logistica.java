package com.shipping.observer;

import com.shipping.decorator.Notificacion;

public class Logistica implements Observer {
    
    private Notificacion notificacion;

    public Logistica(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void actualizar(String estado) {
        notificacion.notify("Cliente notificado: Pedido " + estado);
    }
}
