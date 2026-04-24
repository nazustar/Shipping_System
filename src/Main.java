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
import src.strategy.EstrategiaEnvio;

public class Main {
    public static void main(String[] args) {

        ConfiguracionSistema config = ConfiguracionSistema.getInstance();
        config.setImpuesto(0.19);
        config.setMoneda("COP");
        config.setDescuento(5000);

        Pedido pedido = PedidoFactory.createPedido("nacional");


        Cliente cliente = new Cliente("David");

        Notificacion notificacion = new Cifrado(new Logging(new NotificacionBase()));
        System.out.println("Decoradores activos: " + notificacion.getDescription());

        Logistica logistica = new Logistica(notificacion);

        pedido.addObserver(cliente);
        pedido.addObserver(logistica);


        EstrategiaEnvio estrategia = new EnvioEstandar();
        System.out.println("\n--- Envio Estandar ---");
        System.out.println("Costo: " + estrategia.calcularCosto(50000, config));
        pedido.setEstado("EN_PREPARACION");

        estrategia = new EnvioExpress();
        System.out.println("\n--- Envio Express ---");
        System.out.println("Costo: " + estrategia.calcularCosto(50000, config));
        pedido.setEstado("ENVIADO");

        estrategia = new EnvioProgramado();
        System.out.println("\n--- Envio Programado ---");
        System.out.println("Costo: " + estrategia.calcularCosto(50000, config));
        pedido.setEstado("ENTREGADO");
    }
}