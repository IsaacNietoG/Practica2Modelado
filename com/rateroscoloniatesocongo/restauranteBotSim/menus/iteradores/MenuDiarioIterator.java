package com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

import java.util.Iterator;

/**
 *  El iterador diseñado para el Menu Diario.
 *
 *  Ya que el menu diario se guarda en un {@link java.lang.reflect.Array}, este iterador
 *  está diseñado para recorrer dicha estructura de datos.
 *  */
public class MenuDiarioIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    int posicion;

    /**
     *  El constructor de nuestras instancias de esta clase
     *
     *  @param items    el arreglo sobre el que queremos iterar.
     *  */
    public MenuDiarioIterator(MenuItem[] items) {
        this.items = items;
        posicion = 0;
    }

    /**
     *  Consultar documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.Iterador}
     *  */
    @Override
    public boolean hasNext() {
        return items.length > posicion;
    }

    /**
     *  Consultar documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.Iterador}
     *  */
    @Override
    public MenuItem next() {
        return items[posicion++];
    }
}
