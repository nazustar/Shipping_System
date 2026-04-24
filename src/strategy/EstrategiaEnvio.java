package src.strategy;

import src.singleton.ConfiguracionSistema;

public interface EstrategiaEnvio {
    // Estrategia para calcular costo.
    public double calcularCosto(double base, ConfiguracionSistema config);
}