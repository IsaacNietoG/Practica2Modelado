package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;


/**
 *  Clase de estado para el robot: Cocinando
 *
 *  En este estado, el robot ya ha levantado la orden y tiene pendiente
 *  cocinarla, por lo que en este estado solamente puede cocinar la orden que
 *  tiene pendiente.
 *  */
public class StateRobotCocinando implements StateRobot{
    StateRobot robot;

    public StateRobotCocinando(StateRobot robot){
        this.robot = robot;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  No esta permitida esta operacion en este estado, por lo que deberia de
     *  estar prohibida.
     *  */
    @Override
    public void suspender() {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  No esta permitida esta operacion, pues tecnicamente ya está activado.
     *  */
    @Override
    public void activar() {
        // TODO Auto-generated method stub

    }


    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  No esta permitida esta operacion, pues no puede tomar ordenes mientras cocina
     *  */
    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En esta operacion se realiza el cambio de estado, pues el robot cocina la receta recibida y es
     *  entonces cuando pasa al estado de entregarle la hamburguesa al cliente. (es StateRobotEntregado)
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        // TODO Auto-generated method stub

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  Esta operacion no se puede realizar en este estado pues no se puede interactuar con el cliente mientras está cocinando.
     *  */
    @Override
    public void interactuarCliente() {
        // TODO Auto-generated method stub

    }

}
