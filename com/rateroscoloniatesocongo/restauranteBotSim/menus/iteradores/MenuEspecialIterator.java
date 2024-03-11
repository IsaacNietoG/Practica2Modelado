package com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  El iterador que recorre el Menu Especial.
 *
 *  Ya que el menu especial está hecho en una {@link Hashtable} necesitamos crear este
 *  iterador pensando en dicha estructura.
 *  */
public class MenuEspecialIterator implements Iterator<MenuItem> {

    private Hashtable<Integer, MenuItem> items;
    private Enumeration<Integer> claves;

    /**
     *  El metodo constructor de esta clase.
     *
     *  @param items    La hashtable sobre la que va a iterar la instancia.
     *  */
    public MenuEspecialIterator(Hashtable<Integer, MenuItem> items){
        this.items = items;
        claves = items.keys();
    }

    /**
     *  Consultar la documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.Iterador}
     *  */
    @Override
    public boolean hasNext() {
        return claves.hasMoreElements();
    }

    /**
     *  Consultar la documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.Iterador}
     *  */
    @Override
    public MenuItem next() {
        return items.get(claves.nextElement());
    }

}
