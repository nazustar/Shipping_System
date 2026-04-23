package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioExpress implements EstrategiaEnvio {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        double recargo = 10000;
        double total = base + recargo;
        return total + (total * config.getImpuesto());
    }
}