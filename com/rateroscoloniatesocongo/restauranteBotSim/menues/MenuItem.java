package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas.HamburguesaReceta;

/**
 *  La clase que guarda la informacion de un item en un menu
 *
 *  Para este proyecto, nosotros debemos de realizar una emulacion de un restaurante de hamburguesas, por lo que,
 *  para este caso concreto, nuestra clase MenuItem nos guardará toda la información necesaria sobre cada uno de las
 *  hamburguesas.
 *
 *  Esto abarca tanto informacion de display como la información que necesita nuestro Robot para realizar la hamburguesa, es
 *  decir, la receta de la hamburguesa.
 *  */
public class MenuItem{

    int id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;
    HamburguesaReceta receta;

    public MenuItem(int id,String nombrePlatillo,String descripcion,double precioPlatillo,boolean tieneQueso,boolean esVegetariana){
      this.id = id;
      this.nombre = nombre;
      this.descripcion = descripcion;
      this.precio = precio;
      this.tieneQueso = tieneQueso;
      this.esVegetariano =  esVegetariano;
      
	}
    /**
     *@return nombrePlatillo
     */
	public String obtenerNombre(){
	  return this.nombre;
	}
    /**
     *@return descripcion
     */
	public String obtenerDescripcion(){
	  return this.descripcion;	
	}
    /**
     *@return el precio del platillo
     */
	public double obtenerPrecio(){
	  return this.precio;	
	}
    /**
     *@return esVegetariana
     */
	public boolean esVegetariano(){
	  return this.esVegetariano;
	}
    /**
     *@return tieneQueso
     */
	public boolean tieneQueso(){
	  return this.tieneQueso;	
	}
    /**
     *@return id
     */
	public int obtenerId(){
	  return this.id;
	}
    /**
     *@Override
     *@return la descripcion
     */
	public String toString(){
	  String queso = "";
	  String vegetariano = "";	
	  if(tieneQueso){
	  	queso = "si";
	  }else{
	  	queso = "no";
	  }
	  if(esVegetariano){
	  	vegetariano = "si";
	  }else{
	  	vegetariano = "no";
	  }
	  return "Nombre: " + this.nombre + "\n" + "id: " + String.valueOf(this.id) + "\n" + "descripcion: " + this.descripcion + "\n" + "precio: " + String.valueOf(this.precio) 
	  + "\n" + "vegetariana: " + vegetariano + "\n" + "tiene queso: " + queso;
	}

}
