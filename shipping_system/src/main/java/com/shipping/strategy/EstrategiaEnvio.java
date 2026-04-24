package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public interface EstrategiaEnvio {
    // Estrategia para calcular costo.
    public double calcularCosto(double base, ConfiguracionSistema config);
}
