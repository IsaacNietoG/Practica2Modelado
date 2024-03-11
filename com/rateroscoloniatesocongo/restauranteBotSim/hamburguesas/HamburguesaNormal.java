package.com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;
public class HamburguesaNormal extends Hamburguesa{

    /**
     *@Override
     */
   public void prepararCarne(){
      AdornarTexto texto = new AdornarTexto("Coccion");
      String coccion = texto.ponerContorno("*");
      String descripcion = "se esta cocciendo la carne, esta si es hamburguesa jeje!!!";
      this.prepararCarne = coccion + "\n" + descripcion;
   }

    /**
     *@Override
     */
   public void ponerCarne(){
       System.out.println("Agrego carne")
   }
}
