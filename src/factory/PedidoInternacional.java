package src.factory;

public class PedidoInternacional extends Pedido {

    private String paisDestino;

    public PedidoInternacional() {
        this.paisDestino = "Sin especificar";
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String pais) {
        this.paisDestino = pais;
    }
}