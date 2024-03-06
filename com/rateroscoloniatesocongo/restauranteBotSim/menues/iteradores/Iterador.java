package com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;

/**
 *  La interface que deben implementar los iteradores de nuestro programa
 *
 *  Segun el patron de diseño Iterator, estos nos deben de proporcionar metodos
 *  next() y hasNext() para poder iterar sobre nuestras estructuras de datos.
 *  En esta implementacion concreta, estas estructuras de datos serán los menús.
 *  */
public interface Iterador{

    /**
     *  El metodo que nos permite movernos a través de la estructura de datos donde implementemos nuestro iterador.
     *  Debe de mover el iterador a la vez de que nos retorna el elemento del nodo que acaba de pasar al realizar esta
     *  acción
     *
     *  @return el MenuItem que se encontraba en el nodo que va a pasar el iterador cuando procedamos con su avance.
     *  */
    public MenuItem next();

    /**
     * Nos indica si el Iterador en su posición actual tiene un nodo siguiente al cual pueda llegar.
     *
     * Este metodo es esencial para nuestro Iterador, pues para evitar errores de la naturaleza de {@link IndexOutOfBoundsException}
     * necesitamos saber en todo momento esta información
     *
     * @return booleano que nos indica si existe un elemento siguiente.
     *  */
    public boolean hasNext();
}
