package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;
import com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas.HamburguesaReceta;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;


/**
 *  Clase de estado para el robot: Cocinando
 *
 *  En este estado, el robot ya ha levantado la orden y tiene pendiente
 *  cocinarla, por lo que en este estado solamente puede cocinar la orden que
 *  tiene pendiente.
 *  */
public class StateRobotCocinando implements StateRobot{
    Robot robot;
    MenuItem pedido;

    public StateRobotCocinando(Robot robot, MenuItem pedido){
        this.robot = robot;
        this.pedido = pedido;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  No esta permitida esta operacion en este estado, por lo que deberia de
     *  estar prohibida.
     *  */
    @Override
    public void suspender() {
        System.out.println("No puede suspenderse en este momento, el robot tiene una orden pendiente");

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  No esta permitida esta operacion, pues tecnicamente ya está activado.
     *  */
    @Override
    public void activar() {
        System.out.println("El robot ya se encuentra activo, de hecho, ya tiene una orden pendiente");

    }


    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  No esta permitida esta operacion, pues no puede tomar ordenes mientras cocina
     *  */
    @Override
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("El robot ya tomó una orden, no puede tomar otra.");

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En esta operacion se realiza el cambio de estado, pues el robot cocina la receta recibida y es
     *  entonces cuando pasa al estado de entregarle la hamburguesa al cliente. (es StateRobotEntregado)
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa){
        System.out.println("Cocinando el pedido...");
        System.out.println("Hamburguesa encargada... " + hamburguesa.getNombre());
        HamburguesaReceta proceso = hamburguesa.getReceta();
        proceso.prepararHamburguesa();
        System.out.println("Hamburguesa lista para servirse");
        robot.estado = new StateRobotEntregado(robot);

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  Esta operacion no se puede realizar en este estado pues no se puede interactuar con el cliente mientras está cocinando.
     *  */
    @Override
    public void interactuarCliente() {
        System.out.println("El robot no puede interactuar con el cliente, tiene una orden pendiente.");

    }

}
