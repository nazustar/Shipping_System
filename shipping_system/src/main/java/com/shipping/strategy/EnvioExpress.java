package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioExpress implements EstrategiaEnVivo {
    
    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        base = 7000;
        return base + (base * config.getImpuesto());
    }

}
