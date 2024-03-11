package com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

import java.util.Iterator;

/private MenuItem[] items;
	private int posicion = 0;

	public MenuDiarioIterator(MenuItem[] items){
      this.items = items;
	}

    /**
     *@Override
     *@return la iteracion del menu
     */
	public MenuItem next(){
      MenuItem menuItem = this.items[posicion];
      this.posicion = this.posicion+1;
      return menuItem;
	}
    /**
     *@Override
     *@return si la posicion no es mayor a la long del item y la posicion del item no es null 
     */
	public boolean hasNext(){
      return !(posicion >= items.length) && !(items[posicion] == null);
	}


}
