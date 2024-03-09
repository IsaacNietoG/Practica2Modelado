package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase de estado para el robot: Caminando
 *
 *  En este estado, el robot ha sido activado por la presencia de un cliente
 *  y está caminando hacia atenderlo.
 *  */
public class StateRobotCaminando implements StateRobot{

    Robot robot;

    public StateRobotCaminando(StateRobot robot){
        this.robot = (Robot)robot;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  Si el robot se encuentra caminando y no encontró el cliente hacia
     *  el que estaba caminando, puede regresar a suspenderse. vease
     *  {@link StateRobotSuspendido}
     *  */
    @Override
    public void suspender() {

        System.out.println("El robot se encuentra caminando, no se puede suspender en estos momentos");
    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  En este estado el robot tecnicamente ya se encuentra activo, por lo que
     *  no puede volver a activarse esta orden.
     *  */
    @Override
    public void activar() {
        System.out.println("El robot ya se encuentra activo, de hecho está caminando");
    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  En este estado todavía no llega hacia su cliente, por lo que
     *  todavia no puede tomar la orden.
     *  */
    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("El robot no ha llegado a un cliente, no puede tomar la orden");

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En este estado no puede cocinar porque no tiene todavia ninguna orden
     *  lista para comenzar a ser cocinada.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        System.out.println("El robot no puede cocinar en estos momentos");

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  En este estado se dice que esta accion se activa cuando encuentra el cliente
     *  hacia el que estaba caminando, en este caso cambia su estado a atenderlo.
     *  Vease {@link StateRobotAtendiendo}
     *  */
    @Override
    public void interactuarCliente() {
        System.out.println("Buenas tardes, bienvenido a McBurguesas, puedo tomar su pedido");
        this.robot.estado = new StateRobotAtendiendo(this.robot);
    }

}
