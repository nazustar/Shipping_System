package com.shipping.singleton;

public class ConfiguracionSistema {
          private static ConfiguracionSistema configuracionSistema;


          public static ConfiguracionSistema casosMonedas(){
                    if(configuracionSistema == null){
                              ConfiguracionSistema.configuracionSistema = new ConfiguracionSistema();
                              return configuracionSistema;
                    }
                    else {return configuracionSistema;}
          }
}