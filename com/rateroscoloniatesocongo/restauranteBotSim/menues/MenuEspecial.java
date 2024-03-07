package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import java.util.Hashtable;

/**
 *  Esta es la clase que contiene la informacion y algoritmos necesarios para el Menu Especial
 *
 *  Debido a que el Menu Especial contiene hamburguesas caras y de lujo, estas se guardan en un
 *  {@link Hashtable} por lo que utilizaremos el iterador correspondiente.
 *  */
public class MenuEspecial implements Menu{

    Hashtable<Integer, MenuItem> items;

    public MenuEspecial(Hashtable<Integer, MenuItem> items){
        this.items = items;
    }

    @Override
    public Iterador crearIterador() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MenuItem buscarMenuId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerNombreMenu() {
        // TODO Auto-generated method stub
        return null;
    }

}
