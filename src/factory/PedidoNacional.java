package src.factory;

public class PedidoNacional extends Pedido {

    private String departamentoDestino;

    public PedidoNacional() {
        this.departamentoDestino = "Sin especificar";
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public void setDepartamentoDestino(String departamento) {
        this.departamentoDestino = departamento;
    }
}