package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import java.util.ArrayList;

/**La clase que guarda la informacion y nos permite interactuar con el menu de cada dia
 *
 *  Dependiendo del gusto del gerente, el menu puede cambiar de un dia para otro y tener
 *  mas o menos platillos. Por lo tanto, la estructura de datos donde se guarda dicha informacion
 *  es una {@link ArrayList}
 *  */
public class MenuCadaDia implements Menu{
    ArrayList<MenuItem> items;

    public MenuCadaDia(ArrayList<MenuItem> items){
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
