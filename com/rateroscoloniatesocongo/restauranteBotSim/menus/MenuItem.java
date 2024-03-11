package com.rateroscoloniatesocongo.restauranteBotSim.menus;

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
    
    public MenuItem(int id, String nombre, String descripcion, double precio, boolean tieneQueso,
                    boolean esVegetariano, HamburguesaReceta receta){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;
        this.receta = receta;
        
    }
    /**
     *@return nombrePlatillo
     */
	public String getNombre(){
	  return nombre;
	}
    /**
     *@return descripcion
     */
	public String getDescripcion(){
	  return descripcion;	
	}
    /**
     *@return el precio del platillo
     */
	public double getPrecio(){
	  return precio;	
	}
    /**
     *@return esVegetariano
     */
	public boolean esVegetariano(){
	  return esVegetariano;
	}
    /**
     *@return tieneQueso
     */
	public boolean tieneQueso(){
	  return tieneQueso;	
	}
    /**
     *@return id
     */
	public int getId(){
	  return id;
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
	  return "Nombre: " + nombre + "\n" + "id: " + String.valueOf(id) + "\n" + "descripcion: " + descripcion + "\n" + "precio: " + String.valueOf(precio) 
	  + "\n" + "vegetariano: " + vegetariano + "\n" + "tiene queso: " + queso;
	}

}
