package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import java.util.ArrayList;

/**La clase que guarda la informacion y nos permite interactuar con el menu de cada dia
 *
 *  Dependiendo del gusto del gerente, el menu puede cambiar de un dia para otro y tener
 *  mas o menos platillos. Por lo tanto, la estructura de datos donde se guarda dicha informacion
 *  es una {@link ArrayList}
 *  */
public class MenuCadaDia implements Menu{
    private ArrayList<MenuItem> items;

  public MenuCadaDia(){
     this.items = new ArrayList<MenuItem>(); 
  }

  public void agregarItem(int id,String nombrePlatillo,String descripcion,double precioPlatillo,boolean tieneQueso,boolean esVegetariana){
    MenuItem menu = new MenuItem(id,nombrePlatillo,descripcion,precioPlatillo,tieneQueso,esVegetariana);
    this.items.add(menu);
  }

    /**
     *@Override
     */
  public Iterator crearIterador(){
    return new MenuCadaDiaIterator(this.items); 
  }
  /**
   *@return m
   *@return null
   *@Override
   */
  public MenuItem buscarMenuId(int id){
    for(MenuItem m:this.items){
      if(m.obtenerId() == id){
        return m;
      }
    }
    return null;
  }/**
    *@Override
    *@return Menu de cada dia
    */
  
  public String obtenerNombreMenu(){
    return "Menu de cada dia";
  }
}
