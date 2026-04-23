package com.shipping.singleton;

public class ConfiguracionSistema {
    private static ConfiguracionSistema configuracionSistema;

    private double impuesto;
    private String moneda;
    private double descuento;

    // Constructor privado para instancias.
    public static ConfiguracionSistema casosMonedas (){
        if(configuracionSistema == null){
            ConfiguracionSistema.configuracionSistema = new ConfiguracionSistema();
            return configuracionSistema;
        }else {
            return configuracionSistema;
        }
    }

    // Getters y setters.
    public double getImpuesto (){
        return impuesto;
    }

    public String getMoneda (){
        return moneda;
    }

    public double getDescuento (){
        return descuento;
    }

    public void setImpuesto (double impuesto){
        impuesto = this.impuesto;
    }

    public void setMoneda (String moneda){
        moneda = this.moneda;
    }

    public void setDescuento (double descuento){
        descuento = this.descuento;
    }

}