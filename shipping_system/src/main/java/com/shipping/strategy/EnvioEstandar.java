package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioEstandar implements EstrategiaEnvio {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        // Aplicacion para envio estandar.
        return base + (base * config.getImpuesto());
    }
    
}
