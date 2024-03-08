package com.rateroscoloniatesocongo.restauranteBotSim.menus;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.MenuDiarioIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  Este es el menu general del restaurante
 *
 *  El numero de hamburguesas ofrecidas es inamovible por lo que podemos
 *  usar un arreglo libremente y de la misma manera utilizamos el iterador
 *  que diseñamos para esta aplicación.
 *  */
public class MenuDiario implements Menu {
    MenuItem[] items;

    public MenuDiario(MenuItem[] items){

    }

    @Override
    public Iterator<MenuItem> crearIterador() {
        return new MenuDiarioIterator(items);
    }

    @Override
    public MenuItem buscarMenuId(int id) {

        Iterator<MenuItem> iterator = crearIterador();
        MenuItem menuItem;

        while (iterator.hasNext()) {
            if((menuItem = iterator.next()).id == id) {
                return menuItem;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public String obtenerNombreMenu() {
        return "Menú Diario";
    }
}
