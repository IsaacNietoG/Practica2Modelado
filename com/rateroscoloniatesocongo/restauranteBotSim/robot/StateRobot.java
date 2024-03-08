package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;

/**
 *  La interface que nos da los comportamientos que debe tener el robot y sus estados
 *
 *  Para motivos de una implementación más completa y escalable, decidimos implementar el patron State
 *  para modelar los distintos estados en los que estará nuestro robot.
 *
 *  Durante estos estados, el robot podrá o no realizar ciertas acciones, y de la misma manera puede que
 *  alguna de estas acciones las realice de forma distinta.
 *  */
public interface StateRobot{

    public void suspender();
    public void activar();
    public void tomarOrden();
    public void cocinar(MenuItem hamburguesa);
    public void interactuarCliente();

}
