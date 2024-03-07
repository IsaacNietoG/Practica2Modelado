package com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;
import java.util.ArrayList;


/**
 * Iterador para el menu de cada dia de nuestro programa
 *
 * Este iterador está diseñado para funcionar sobre {@link ArrayList}
 * */
public class MenuCadaDiaIterator implements Iterador{

    private ArrayList<MenuItem> items;
    private int posicion;

    /**
     *  El constructor del iterador
     *
     *  Crea un iterador asociado a la ArrayList necesaria.
     *
     *  @param items    la ArrayList asociada al iterador.
     *
     *  @return una instancia de Iterador asociada a la arraylist proporcionada
     *  */
    public MenuCadaDiaIterator(ArrayList<MenuItem> items){
        this.items = items;
        posicion = 0;
    }

    /**
     *  Nos dice si el iterador puede seguir avanzando dentro de la estructura.
     *
     *  @return el booleano que nos responde dicha pregunta
     *  */
    public boolean hasNext(){
        return (this.items.size()>posicion);
    }

    /**
     *  Avanza el iterador una posición y nos retorna el item que pertenecía al nodo que
     *  avanzó.
     *
     *  @return el item del nodo que avanzó durante el paso.
     *  */
    public MenuItem next(){
        MenuItem retorno = items.get(posicion);
        posicion++;
        return retorno;
    }
}
