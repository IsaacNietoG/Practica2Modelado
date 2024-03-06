package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

/**
 *  La clase abstracta de una receta de Hamburguesa
 *
 *  Siguiendo el patron template, esta clase implementa los pasos generalizados de una
 *  receta de hamburguesa en forma de una serie de métodos que luego se concentran
 *  en uno solo.
 *
 *  Esta clase abstracta posee dos métodos hooks que son los que implementaremos en cada receta
 *  de hamburguesa según sus particularidades.
 *  */
public abstract class HamburguesaReceta{

    /**
     *  El metodo que concentra todos los pasos necesarios para preparar una hamburguesa.
     *
     *  Siguiendo el patron Template, este es el metodo que concentra todos nuestros metodos en el resultado
     *  final. Especificamente para este caso, reune todos los pasos generalizados de preparar una hamburguesa
     *
     *  @return **** E banda, no sé como vamos a implementar esto pero me hace ruido este return, segun yo si algo
     *  aqui debe retornar algo debería ser este método.
     *  */
    public void prepararHamburguesa(){
        ponerPan();
        ponerAderezo();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerVegetales();
    }

    public void ponerPan(){

    }

    public void ponerAderezo(){

    }

    abstract public void prepararCarne();

    public void ponerCarne(){

    }

    abstract public void ponerQueso();

    public void ponerVegetales(){

    }
}
