package src.factory;

public class PedidoFactory {

    public static Pedido createPedido(String type) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de pedido no puede ser nulo");
        }
        
        switch (type.trim().toLowerCase()) {
            case "nacional":
                return new PedidoNacional();
            case "internacional":
                return new PedidoInternacional();
            default:
                throw new IllegalArgumentException("Tipo de pedido no reconocido: " + type);
        }
    }
}