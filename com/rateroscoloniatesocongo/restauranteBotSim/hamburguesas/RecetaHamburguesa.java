package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

/**
 *  La clase abstracta de una receta de Hamburguesa
 *
 *  Siguiendo el patron template, esta clase implementa los pasos generalizados de una
 *  receta de hamburguesa en forma de una serie de métodos que luego se concentran
 *  en uno solo.
 *
 *  Esta clase abstracta posee dos métodos hooks que son los que implementaremos en cada receta
 *  de hamburguesa según sus particularidades.
 *  */
public abstract class HamburguesaReceta{
    protected String hamburguesaPreparada;
    protected boolean queso = true;
    protected String prepararCarne = "";

    public void prepararHamburguesa(){
       ponerPan();
       ponerMayonesa();
       ponerMostaza();
       prepararCarne();
       ponerCarne();
       if(llevaQueso()){
       	  ponerQueso();
       }
       ponerVegetales();
       ponerCatsup();
       ponerPan();
    }
    /**
     *@return hamburgesaPreparada
     */
    public String obtenerHamburguesa(){
       return this.hamburguesaPreparada;
    }
    /**
     *@return prepararCarne
     */
    public String obtenerCoccionCarne(){
       return this.prepararCarne;
    }
 
    public void ponerPan(){
      String pan = "🍞";
      this.hamburguesaPreparada += pan;      
    }

    public void ponerMayonesa(){
      String mayonesa = "⚪";
      this.hamburguesaPreparada += mayonesa;	
    }

    public void ponerMostaza(){
      String mostaza = "🟡";
      this.hamburguesaPreparada += mostaza; 	
    }

    public void ponerVegetales(){
      String vegetales = "🍅" + "🥬";
      this.hamburguesaPreparada += vegetales;
    }

    public void ponerCatsup(){
      String catsup = "🔴";
      this.hamburguesaPreparada += catsup;	
    }

    public void ponerQueso(){
      String queso = "🧀";
      this.hamburguesaPreparada += queso;
    }

    public boolean llevaQueso(){
      return  this.queso;
    }
    
    public void asignarQueso(boolean queso){
      this.queso = queso;
    }
    
    
    public abstract void prepararCarne();
    public abstract void ponerCarne();

}
