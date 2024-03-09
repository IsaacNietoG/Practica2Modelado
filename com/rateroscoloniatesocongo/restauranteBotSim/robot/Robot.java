package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase concreta de un robot para este proyecto
 *
 *  Aqui implementamos el patron de diseño State para modelar
 *  los distintos cambios de estado que nuestro robot experimentará a lo largo
 *  del programa.
 *
 *  Para esto, todas las acciones posibles que pueda realizar el robot
 *  son designadas a su estado interno. (vease StateRobot estado)
 *
 *  Empieza en su estado inicial que es encendido.
 *  */
public class Robot implements StateRobot{

    StateRobot estado;

    public Robot(){
        this.estado = new StateRobotEncendido(this);
    }

    @Override
    public void suspender() {
        // TODO Auto-generated method stub

    }

    @Override
    public void activar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tomarOrden() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cocinar(MenuItem hamburguesa) {
        // TODO Auto-generated method stub

    }

    @Override
    public void interactuarCliente() {
        // TODO Auto-generated method stub

    }


}
