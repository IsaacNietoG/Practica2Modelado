package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import java.util.Scanner;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase de estado para el robot: Atendiendo.
 *
 *  En este estado, el robot ha caminado hacia su cliente y está esperando
 *  a levantar la orden para después comenzar a cocinarla.
 *  No puede hacer otra cosa que no sea tomar la orden del usuario.
 *  */
public class StateRobotAtendiendo implements StateRobot{

    Robot robot;

    public StateRobotAtendiendo(Robot robot){
        this.robot = robot;
    }

    /**
     *  Implementacion concreta de suspender para este {@link StateRobot}
     *
     *  Bajo este estado no puede suspenderse, pues está atendiendo a un
     *  cliente.
     *  */
    @Override
    public void suspender() {
        System.out.println("No puede suspenderse el robot mientras está atendiendo");

    }

    /**
     *  Implementacion concreta de activar para este {@link StateRobot}
     *
     *  Bajo este estado tecnicamente ya se encuentra activo, asi que no puede
     *  volver a dar esta accion.
     *  */
    @Override
    public void activar() {
        System.out.println("El robot ya se encuentra activo, de hecho está atendiendo");

    }

    /**
     *  Implementacion concreta de tomarOrden para este {@link StateRobot}
     *
     *  Este es el estado adecuado en el que se puede tomar la orden del cliente,
     *  por lo que aqui debe ser implementado dicho comportamiento.
     *
     *  Ademas, una vez tomada la orden se procede a cambiar de estado a
     *  vease {@link StateRobotCocinando}
     *  */
    public void tomarOrden(MenuGlobal menuGlobal) {
        System.out.println("Aqui está el menú, digame que va a llevar");
        System.out.println(menuGlobal);
        Scanner input = new Scanner(System.in);
        int opcion = -1;
        try{
            opcion = Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Opcion invalida.");
            return;
        }
        MenuItem eleccion = menuGlobal.buscarItem(opcion);
        if(eleccion == null){
            System.out.println("Opcion invalida.");
            return;
        }

        System.out.println("Orden recibida correctamente, listo para cocinar.");
        robot.estado = new StateRobotCocinando(robot, eleccion);

    }

    /**
     *  Implementacion concreta de cocinar para este {@link StateRobot}
     *
     *  En este estado todavia no recibe la orden del cliente, por lo que
     *  todavia no puede cocinar nada. vease {@link StateRobotCocinando}
     *  */
    @Override
    public void cocinar(MenuItem hamburguesa) {
        System.out.println("El robot no puede cocinar todavia, no tiene pedido todavia");

    }

    /**
     *  Implementacion concreta de interactuarCliente para este {@link StateRobot}
     *
     *  En este estado la unica interaccion valida que se puede dar entre el
     *  robot y el cliente es vease tomarOrden. Por lo que esta opcion no estará
     *  implementada.
     *  */
    @Override
    public void interactuarCliente() {
        System.out.println("El robot esta atendiendo a alguien, asi que su interaccion es pedirle la orden");

    }

}
