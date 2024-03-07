package com.rateroscoloniatesocongo.restauranteBotSim.menues;

/**
 *  Este es el menu general del restaurante
 *
 *  El numero de hamburguesas ofrecidas es inamovible por lo que podemos
 *  usar un arreglo libremente y de la misma manera utilizamos el iterador
 *  que diseñamos para esta aplicación.
 *  */
public class MenuDiario implements Menu{
    MenuItem[] items;

    public MenuDiario(MenuItem[] items){

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
