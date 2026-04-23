package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public interface EstrategiaEnVivo {
    // Estrategia para calcular costo.
    public double calcularCosto(double base, ConfiguracionSistema config);
}
