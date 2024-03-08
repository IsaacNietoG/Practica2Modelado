package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;

public class StateRobotSuspendido implements StateRobot{

    StateRobot robot;

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  En este estado el robot ya está suspendido entonces teoricamente no debería de hacer nada.
     *  */
    @Override
    public void suspender() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  Cambia el estado del robot a StateRobotActivado
     *  */
    @Override
    public void activar() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  Debe de rechazar esta accion, ya que un robot en este estado no puede
     *  tomar ordenes.
     *  */

    @Override
    public void tomarOrden() {
        // TODO Auto-generated method stub

    }


    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  Debe de rechazar esta accion, ya que un robot en este estado no puede tomar ordenes.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        // TODO Auto-generated method stub

    }


    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  Supuestamente un robot suspendido no deberia de poder ¨interactuar" con un cliente, pero
     *  la propuesta del documentador para este metodo es que lo active y lo haga tal vez caminar hacia el cliente?
     *  */
    @Override
    public void interactuarCliente() {
        // TODO Auto-generated method stub

    }

}
