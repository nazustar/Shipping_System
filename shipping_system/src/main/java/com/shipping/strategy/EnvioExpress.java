package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioExpress implements EstrategiaEnvio {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        // Aplicacion para envio express.
        // Con recargo fijo de 20000.
        
        double recargo = 20000;
        double total = base + recargo;
        return total + (total * config.getImpuesto());
    }
}