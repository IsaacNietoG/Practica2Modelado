/
package com.rateroscoloniatesocongo.restauranteBotSim;
public class OpcionInvalida extends Exception{
   public OpcionInvalida(){
      super();
   }
   public OpcionInvalida(String mensaje){
      super(mensaje);
   }
}
