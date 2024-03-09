package com.rateroscoloniatesocongo.restauranteBotSim.menus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  La clase que unifica todos los menus del restaurante.
 *
 *  Recibe todos los menus iterables y los reune en uno solo. Tiene metodos para
 *  refrescar el contenido si es necesario.
 *  */
public class MenuGlobal{

    Menu[] menus;
    ArrayList<MenuItem> menuFinal;
    MenuGlobal instance;

    /**
     *  El constructor de la clase MenuGlobal
     *
     *  Recibe como entrada un arreglo de los menus que queremos recabar dentro de uno solo.
     *  Realiza por primera vez el metodo refrescarContenido para llenar por primera vez el menuFinal.
     *  */
    public MenuGlobal(Menu[] menus){
        this.menus = menus;
        refrescarContenido();
    }

    /**
     *  Refresca el contenido del menu final.
     *
     *  Para esto, vuelve a iterar sobre todos los menus de donde debe de recabar la informacion y de esta
     *  manera puede recabar los items nuevamente.
     *  */
    public void refrescarContenido(){
        ArrayList<MenuItem> menuPreparado = new ArrayList<>();
        for(Menu menu : menus){
            Iterator<MenuItem> iterador = menu.crearIterador();
            while(iterador.hasNext()){
                menuPreparado.add(iterador.next());
            }
        }
        menuFinal = menuPreparado;
    }

    /**
     *  Da una string con todos los contenidos del menu, separados segun de dónde es cada item.
     *  */
    @Override
    public String toString(){
        refrescarContenido();
        String string = "";
        for(MenuItem item : menuFinal){
            string += item;
            string += "\n";
        }
        return string;
    }

}
