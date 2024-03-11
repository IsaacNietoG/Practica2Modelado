/**
 * AlertaRobot es una exception, representa cualquier error que pueda tener nuestro robot.
 */

package com.practica2.demo.robot;

public class AlertaRobot extends Exception{
   public AlertaRobot(){
   	super();
   }
   public AlertaRobot(String mensaje){
   	super(mensaje);
   }
}
