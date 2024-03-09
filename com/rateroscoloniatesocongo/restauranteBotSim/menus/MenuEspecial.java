package com.rateroscoloniatesocongo.restauranteBotSim.menus;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.MenuEspecialIterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Objects;

/**
 *  Esta es la clase que contiene la informacion y algoritmos necesarios para el Menu Especial
 *
 *  Debido a que el Menu Especial contiene hamburguesas caras y de lujo, estas se guardan en un
 *  {@link Hashtable} por lo que utilizaremos el iterador correspondiente.
 *  */
public class MenuEspecial implements Menu {

    private Hashtable<Integer,MenuItem> items;

   public MenuEspecial(){
   	 this.items = new Hashtable<Integer,MenuItem>();
   }

<<<<<<< HEAD:com/rateroscoloniatesocongo/restauranteBotSim/menues/MenuEspecial.java
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

=======
    @Override
    public Iterator<MenuItem> crearIterador() {
        return new MenuEspecialIterator(items);
    }

    @Override
    public MenuItem buscarMenuId(int id) {
        return Objects.requireNonNull(items.get(id));
    }

    @Override
    public String obtenerNombreMenu() {
        return "Menú Especial";
    }
>>>>>>> c75b547630dcaf8961e4466d743fdfde1dde70b1:com/rateroscoloniatesocongo/restauranteBotSim/menus/MenuEspecial.java

}
