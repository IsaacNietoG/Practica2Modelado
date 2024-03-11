package com.rateroscoloniatesocongo.restauranteBotSim.menus.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterador para el menu de cada día de nuestro programa
 *
 * Este iterador está diseñado para funcionar sobre {@link ArrayList}
 * */
public class MenuCadaDiaIterator implements Iterator{
	private ArrayList<MenuItem> items;
	private int posicion = 0;

	public MenuCadaDiaIterator(ArrayList<MenuItem> items){
	  this.items = items;
	}

    /**
     *@Override
     *@return el menu iterado
     *//**
 * Iterador para el menu de cada día de nuestro programa
 *
 * Este iterador está diseñado para funcionar sobre {@link ArrayList}
 * */
public class MenuCadaDiaIterator implements Iterator<MenuItem> {

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
        return this.items.size() > posicion;
    }

    /**
     *  Avanza el iterador una posición y nos retorna el item que pertenecía al nodo que
     *  avanzó.
     *
     *  @return el item del nodo que avanzó durante el paso.
     *  */
    public MenuItem next(){
        return items.get(posicion++);
    }
}

	public MenuItem next(){
	  MenuItem menuItem = items.get(this.posicion);
	  this.posicion = this.posicion+1;
	  return menuItem;	
	}

    /**
     *@Override
     *@return una condicional para hasNext, para el tamano
     */
	public boolean hasNext(){
	  return !(posicion >= items.size());	
	}

}