package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import java.util.Hashtable;

/**
 *  Esta es la clase que contiene la informacion y algoritmos necesarios para el Menu Especial
 *
 *  Debido a que el Menu Especial contiene hamburguesas caras y de lujo, estas se guardan en un
 *  {@link Hashtable} por lo que utilizaremos el iterador correspondiente.
 *  */
public class MenuEspecial implements Menu{

    private Hashtable<Integer,MenuItem> items;

   public MenuEspecial(){
   	 this.items = new Hashtable<Integer,MenuItem>();
   }

   public void agregarItem(int id,String nombrePlatillo,String descripcion,double precioPlatillo,boolean tieneQueso,boolean esVegetariana){
   	 MenuItem menu = new MenuItem(id,nombrePlatillo,descripcion,precioPlatillo,tieneQueso,esVegetariana);
   	 this.items.put(id,menu);
   }

    /**
     *@Override
     *@return MenuEspecialIterator(this.items);
     */
   public Iterator crearIterador(){
   	 return new MenuEspecialIterator(this.items);
   }
    /**
     *@Override
     *@return this.items.get(id);
     */
   public MenuItem buscarMenuId(int id){
      return this.items.get(id);
   }
    /**
     *@Override
     *@return Menu especial
     */
   public String obtenerNombreMenu(){
    return "Menu especial";
   }  


}
