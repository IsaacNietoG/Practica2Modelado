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

    Hashtable<Integer, MenuItem> items;

    public MenuEspecial(Hashtable<Integer, MenuItem> items){
        this.items = items;
    }

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

}
