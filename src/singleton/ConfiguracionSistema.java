package src.singleton;

public class ConfiguracionSistema {
    private static ConfiguracionSistema configuracionSistema;

    private double impuesto;
    private String moneda;
    private double descuento;

    // Constructor privado para instancias.
    private ConfiguracionSistema() {
        this.impuesto = 0.19;
        this.moneda = "COP";
        this.descuento = 0.0;
    }

    // Método renombrado a getInstance() — convención estándar del Singleton.
    // Synchronized para evitar problemas con múltiples hilos.
    public static synchronized ConfiguracionSistema getInstance() {
        if (configuracionSistema == null) {
            configuracionSistema = new ConfiguracionSistema();
        }
        return configuracionSistema;
    }

    // Getters y setters.
    public double getImpuesto() {
        return impuesto;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}