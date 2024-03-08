package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**  */
public class StateRobotEntregado implements StateRobot{

    StateRobot robot;

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  En este estado no puede suspenderse directamente, pues el robot
     *  aun tiene un pedido pendiente por entregar, hipoteticamente lo tiene
     *  en la mano.
     *  */
    @Override
    public void suspender() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  En este estado ya se encuentra activo, por lo que no puede volver
     *  a recurrir a esta orden.
     *  */
    @Override
    public void activar() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  En este estado ya se encuentra pendiente de entregar una orden, por lo que
     *  no puede tomar una orden hasta entregar la pendiente.
     *  */
    @Override
    public void tomarOrden() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En este estado tiene una orden en la mano, por lo que no puede
     *  regresar a la cocina a cocinar otra.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  Durante este estado, la interaccion que tiene este robot con el cliente
     *  es entregarle su pedido, por lo que esta orden es lo que debe hacer, acompañado
     *  de, una vez entregado el pedido, regresar al estado de vease {@link StateRobotSuspendido}
     *  */
    @Override
    public void interactuarCliente() {
        // TODO Auto-generated method stub

    }
}
