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
public abstract class HamburguesaReceta {

    /**
     *  El método que concentra todos los pasos necesarios para preparar una hamburguesa.
     * <p>
     *  Siguiendo el patron Template, este es el método que concentra todos nuestros métodos en el resultado
     *  final. Específicamente para este caso, reúne todos los pasos generalizados de preparar una hamburguesa
     *
     *  @return **** E banda, no sé como vamos a implementar esto pero me hace ruido este return, según yo si algo
     *  aquí debe retornar algo debería ser este método.
     *  */
    public void prepararHamburguesa() {
        ponerPan();
        ponerAderezo();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerVegetales();
    }

    protected void ponerPan() {
        System.out.println("Pan colocado");
    }

    protected void ponerAderezo() {
        System.out.println("Aderezos colocados");
    }

    abstract protected void prepararCarne();

    protected void ponerCarne() {
        System.out.println("Carne colocada");
    }
    abstract protected void ponerQueso();

    protected void ponerVegetales() {
        System.out.println("Poner vegetales");
    }
}
