package com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

public class MenuEspecialIterator implements Iterator{
    private Hashtable<Integer,MenuItem> items;
    private Enumeration<Integer> claves;

    public MenuEspecialIterator(Hashtable<Integer,MenuItem> items){
      this.items = items;
      this.claves = this.items.keys();	
    }

    /**
     *@Override
     *@return clave del siguiente elemento
     */
    public MenuItem next(){
      return this.items.get(this.claves.nextElement());
    }
    /**
     *@Override
     *@return clave del hasMoreElements
     */
    public boolean hasNext(){
      return this.claves.hasMoreElements();
    }
  

}
