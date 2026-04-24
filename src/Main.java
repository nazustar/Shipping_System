package src;

import src.decorator.Cifrado;
import src.decorator.Logging;
import src.decorator.NotificacionBase;
import src.decorator.Notificacion;
import src.factory.Pedido;
import src.factory.PedidoFactory;
import src.observer.Cliente;
import src.observer.Logistica;
import src.singleton.ConfiguracionSistema;
import src.strategy.EnvioEstandar;
import src.strategy.EnvioExpress;
import src.strategy.EnvioProgramado;

public class Main {
    public static void main(String[] args) {

        ConfiguracionSistema config = ConfiguracionSistema.getInstance();
        config.setImpuesto(0.19);
        config.setMoneda("COP");
        config.setDescuento(5000);
        System.out.println("Moneda: " + config.getMoneda() + " | Impuesto: " + config.getImpuesto());

        Pedido pedido = PedidoFactory.createPedido("nacional");
        System.out.println("Pedido creado: " + pedido.getClass().getSimpleName());

        Notificacion notificacion = new Cifrado(new Logging(new NotificacionBase()));
        System.out.println("Decoradores activos: " + notificacion.getDescription());


        Cliente cliente = new Cliente("David");
        Logistica logistica = new Logistica(notificacion);
        pedido.addObserver(cliente);
        pedido.addObserver(logistica);

        pedido.setEstrategia(new EnvioEstandar());
        System.out.println("\n--- Envio Estandar ---");
        System.out.println("Costo: " + pedido.calcularCosto(50000));
        pedido.setEstado("EN_PREPARACION");

        pedido.setEstrategia(new EnvioExpress());
        System.out.println("\n--- Envio Express ---");
        System.out.println("Costo: " + pedido.calcularCosto(50000));
        pedido.setEstado("ENVIADO");

        pedido.setEstrategia(new EnvioProgramado());
        System.out.println("\n--- Envio Programado ---");
        System.out.println("Costo: " + pedido.calcularCosto(50000));
        pedido.setEstado("ENTREGADO");
    }
}