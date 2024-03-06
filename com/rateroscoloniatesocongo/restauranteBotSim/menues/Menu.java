package com.rateroscoloniatesocongo.restauranteBotSim.menues;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.iteradores.Iterador;

/**
 *  La interface que nos especifica que metodos debe llevar un menu.
 *
 *  Esta interface generaliza ciertos comportamientos que nuestras clases de menues
 *  deben de tener, particularmente se enfoca en los metodos que nos ayudarán a unificar
 *  los menues para la interacción con el usuario.
 *
 *  En cierta manera, esta interface asemeja un poco a la interface {@link Iterable} de Java
 *  en el sentido de que obliga a que todos nuestros menues deban proporcionarnos un iterador.
 *  */
public interface Menu{

    /**
     *  Creamos un iterador para nuestro menu
     *
     *  Esto para unificar procedimientos y respetar el encapsulamiento de datos
     *
     *  @return un Iterador con el cual podremos iterar sobre nuestra estructura iterable
     *          (Canek eres tu?)
     *  */
    public Iterador crearIterador();

    /**
     *  Para buscar dentro de nuestro menu un item con una id especifica, retornaremos dicha referencia al usuario.
     *
     *  @param id   La id del MenuItem que queremos buscar
     *
     *  @return el MenuItem con la id proporcionada.
     *  */
    public MenuItem buscarMenuId(int id);

    /**
     *  Retorna el nombre del menu.
     *  */
    public String obtenerNombreMenu();

}
