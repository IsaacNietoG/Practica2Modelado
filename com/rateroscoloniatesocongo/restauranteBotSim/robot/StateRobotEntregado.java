package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase de estado para el robot: Entregado
 *
 *  En este estado, se dice que el robot tiene pendiente por entregar
 *  un pedido que ya está cocinado y listo para entregarse al cliente final.
 *  */
public class StateRobotEntregado implements StateRobot{

    Robot robot;

    public StateRobotEntregado(Robot robot){
        this.robot = robot;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  En este estado no puede suspenderse directamente, pues el robot
     *  aun tiene un pedido pendiente por entregar, hipoteticamente lo tiene
     *  en la mano.
     *  */
    @Override
    public void suspender() {
        System.out.println("El robot tiene una hamburguesa en mano, no puede suspenderse.");

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  En este estado ya se encuentra activo, por lo que no puede volver
     *  a recurrir a esta orden.
     *  */
    @Override
    public void activar() {
        System.out.println("El robot ya se encuentra activado, de hecho tiene una hamburguesa en mano");

    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  En este estado ya se encuentra pendiente de entregar una orden, por lo que
     *  no puede tomar una orden hasta entregar la pendiente.
     *  */
    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("El robot ya tiene una hamburguesa en mano, no puede tomar otra orden");

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En este estado tiene una orden en la mano, por lo que no puede
     *  regresar a la cocina a cocinar otra.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        System.out.println("El robot no puede cocinar una hamburguesa pues ya tiene una pendiente de entregar");

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
        System.out.println("Hamburguesa entregada al cliente, regresando a suspension");
        robot.estado = new StateRobotSuspendido(robot);
    }
}
