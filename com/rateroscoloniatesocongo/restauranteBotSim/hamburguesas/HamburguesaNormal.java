package.com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;
public class HamburguesaNormal extends Hamburguesa{

   public HamburguesaNormal(){
	 this.hamburguesaPreparada = "";
   }
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
   	 String carne = "🥩";
   	 this.hamburguesaPreparada += carne  + "\n";
   }
}
