package com.rateroscoloniatesocongo.restauranteBotSim.menus;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores.MenuCadaDiaIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

/**La clase que guarda la informacion y nos permite interactuar con el menu de cada dia
 *
 *  Dependiendo del gusto del gerente, el menu puede cambiar de un dia para otro y tener
 *  mas o menos platillos. Por lo tanto, la estructura de datos donde se guarda dicha informacion
 *  es una {@link ArrayList}
 *  */
public class MenuCadaDia implements Menu {
    ArrayList<MenuItem> items;

    public MenuCadaDia(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public Iterator<MenuItem> crearIterador() {
        return new MenuCadaDiaIterator(this.items);
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
        return "Menú Cada Día";
    }
}
