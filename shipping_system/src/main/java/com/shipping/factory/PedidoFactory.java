package com.shipping.factory;

public class PedidoFactory{
          
          public static Pedido createPedido(String type){
                    if(type.equals("Nacional")){
                              return new PedidoNacional();
                    }
                    else if (type.equals("Internacional")){
                              return new PedidoInternacional();
                    }
                    else {throw new IllegalArgumentException();}
          }
}