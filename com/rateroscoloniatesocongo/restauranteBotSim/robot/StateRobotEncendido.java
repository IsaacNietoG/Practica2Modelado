package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase de estado para robot: Encendido
 *
 *  En este estado, el robot ha sido encendido pero todavia no se encuentra
 *  activo por algun cliente, es un estado intermedio entre que el robot
 *  se ha encendido/salido de la suspension y es activado por la presencia
 *  de un nuevo cliente para caminar a atenderlo.
 *
 *  Este es el estado "base" del robot y en este inicia el flujo de cambio
 *  de estados del mismo.
 *  */
public class StateRobotEncendido implements StateRobot{
    Robot robot;

    public StateRobotEncendido(Robot robot){
        this.robot = robot;
    }


    /**
     *  Implementacion concreta de suspender para {@link StateRobot}
     *
     *  En este estado no se puede suspender directamente, pues nuestra idea para esta
     *  implementacion es que este estado sea un intermedio entre que el robot se enciende y
     *  se activa para buscar clientes.
     *  */
    @Override
    public void suspender() {
        System.out.println("No puede suspenderse el robot en estos momentos");

    }

    /**
     *  Implementacion concreta de activar para {@link StateRobot}
     *
     *  En este estado se puede activar, lo cual desencadena que el robot se ponga a caminar
     *  (StateRobotCaminando)
     *  */
    @Override
    public void activar() {
        System.out.println("Se ha activado el robot, ahora está caminando al cliente.");
        this.robot.estado = new StateRobotCaminando(robot);


    }


    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  No puede tomar ordenes mientras esta en este estado, esto puede resultar
     *  un poco contraintuitivo pero es porque no es el estado apropiado dentro de nuestra implementacion
     *  vease StateRobotAtendiendo
     *  */
    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("El robot no puede tomar orden pues no ha llegado a ningun cliente");

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  No puede cocinar mientras está en este estado, esto porque no es el estado apropiado dentro
     *  de nuestra implementacion, vease StateRobotCocinando.
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        System.out.println("El robot no puede cocinar pues no ha recibido ninguna orden");

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  No puede interactuar con el usuario en este estado, bajo el supuesto de que este no es el estado
     *  apropiado para esta acción.
     *  */
    @Override
    public void interactuarCliente() {
        System.out.println("El robot no puede interactuar con un cliente pues no ha llegado con ninguno");

    }
}
