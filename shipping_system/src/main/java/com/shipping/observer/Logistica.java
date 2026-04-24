package com.shipping.observer;

import com.shipping.decorator.Notificacion;

public class Logistica implements Observer {
    
    private Notificacion notificacion;

    public Logistica(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void actualizar(String estado) {
        System.out.println("Logistica notificada: " + estado);
    }
}
