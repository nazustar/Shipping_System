package src.observer;

public class Cliente implements Observer {

    // Agregacion de nombre, el estado viene de pedido.
    private String name;

    public Cliente (String name){
        this.name = name;
    }

    // Muestra el estado del pedido al cliente.
    @Override
    public void actualizar(String estado) {
        System.out.println("Cliente " + name + " notificado:" + estado);
    }
}
