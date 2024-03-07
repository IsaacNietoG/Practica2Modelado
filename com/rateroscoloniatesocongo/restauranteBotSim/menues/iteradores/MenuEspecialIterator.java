package com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador;

import java.util.Enumeration;
import java.util.Hashtable;
import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;

/**
 *  El iterador que recorre el Menu Especial.
 *
 *  Ya que el menu especial está hecho en una {@link Hashtable} necesitamos crear este
 *  iterador pensando en dicha estructura.
 *  */
public class MenuEspecialIterator implements Iterador{

    Hashtable<Integer, MenuItem> items;
    Enumeration<Integer> claves;

    /**
     *  El metodo constructor de esta clase.
     *
     *  @param items    La hashtable sobre la que va a iterar la instancia.
     *  */
    public MenuEspecialIterator(Hashtable items){

    }

    /**
     *  Consultar la documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador}
     *  */
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     *  Consultar la documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador}
     *  */
    @Override
    public MenuItem next() {
        // TODO Auto-generated method stub
        return null;
    }

}
