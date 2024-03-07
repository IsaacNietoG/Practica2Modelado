package com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador;

/**
 *  El iterador diseñado para el Menu Diario.
 *
 *  Ya que el menu diario se guarda en un {@link java.lang.reflect.Array}, este iterador
 *  está diseñado para recorrer dicha estructura de datos.
 *  */
public class MenuDiarioIterator implements Iterador{

    MenuItem[] items;

    /**
     *  El constructor de nuestras instancias de esta clase
     *
     *  @param items    el arreglo sobre el que queremos iterar.
     *  */
    public MenuDiarioIterator(MenuItem[] items){

    }

    /**
     *  Consultar documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador}
     *  */
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     *  Consultar documentacion de {@link com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador}
     *  */
    @Override
    public MenuItem next() {
        // TODO Auto-generated method stub
        return null;
    }
}
