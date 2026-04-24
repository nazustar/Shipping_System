package com.shipping.observer;

public class Cliente implements Observer {
    private String message;

    public Cliente (String message){
        this.message = message;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Cliente notificado:" + message);
    }
}
