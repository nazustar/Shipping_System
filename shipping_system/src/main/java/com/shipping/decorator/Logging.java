package com.shipping.decorator;

public class Logging extends ExtensionDecorator {

          @Override
          public String getDescription() {
                    return description;
          }

          @Override
          public void agregarDecoracion() {
                    description = getDescription() + " Se ha hecho una accion \n";
          }
    
}
