package com.shipping.strategy;

import com.shipping.singleton.ConfiguracionSistema;

public class EnvioProgramado implements EstrategiaEnvio {

    @Override
    public double calcularCosto(double base, ConfiguracionSistema config) {
        // Aplicacion para envio programado.
        double descuento = config.getDescuento();
        double total = base - descuento;
        return total + (total * config.getImpuesto());}

}
