package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioEstandar implements EstrategiaEnVivo {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        base = 5000;
        return base + (base * config.getImpuesto());
    }
    
}
