package com.shipping.decorator;

public class Cifrado extends ExtensionDecorator {

          @Override
          public String getDescription() {
                    return description;
          }

          @Override
          public void agregarDecoracion() {
                    description = getDescription() + "el mensaje esta cifrado";
          }
    
}
