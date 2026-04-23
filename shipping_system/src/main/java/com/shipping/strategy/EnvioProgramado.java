package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioProgramado implements EstrategiaEnVivo {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        base = 9000;
        return base + (base * config.getImpuesto());
    }

}
