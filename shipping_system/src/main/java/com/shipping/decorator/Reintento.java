package com.shipping.decorator;

public class Reintento extends ExtensionDecorator {

          private int intentos;

          @Override
          public String getDescription() {
                    return description;
          }

          @Override
          public void agregarDecoracion() {
                    intentos++;
                    description = getDescription() + " Sea han realizado " + intentos + " intentos";
          }
    
}
