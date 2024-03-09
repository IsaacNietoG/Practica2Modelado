package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;

/**
 *  Clase de estado para el robot: Suspendido
 *
 *  En este estado, el robot se encuentra en un modo de ahorro de energía
 *  esperando a que se le vuelva a activar. Una vez se vuelva a activar,
 *  volverá a caminar en busca de un cliente.
 *  */
public class StateRobotSuspendido implements StateRobot{

    Robot robot;

    public StateRobotSuspendido(Robot robot){
        this.robot = robot;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  En este estado el robot ya está suspendido entonces teoricamente no debería de hacer nada.
     *  */
    @Override
    public void suspender() {
        System.out.println("El robot ya se encuentra suspendido.");

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  Cambia el estado del robot a StateRobotEncendido
     *  */
    @Override
    public void activar() {
        System.out.println("El robot sale de su estado de suspension. Ahora está encendido");
        this.robot.estado = new StateRobotEncendido(robot);
    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  Debe de rechazar esta accion, ya que un robot en este estado no puede
     *  tomar ordenes.
     *  */

    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("El robot no puede tomar la orden, pues está suspendido");

    }


    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  Debe de rechazar esta accion, ya que un robot en este estado no puede tomar ordenes.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        System.out.println("El robot no puede cocinar pues se encuentra suspendido.");

    }


    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  Supuestamente un robot suspendido no deberia de poder ¨interactuar" con un cliente, pero
     *  la propuesta del documentador para este metodo es que lo active y lo haga tal vez caminar hacia el cliente?
     *  */
    @Override
    public void interactuarCliente() {
        System.out.println("El robot no puede interactuar con clientes, pues se encuentra suspendido");

    }

}
