package com.rateroscoloniatesocongo.restauranteBotSim.robot;

import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuGlobal;
import com.rateroscoloniatesocongo.restauranteBotSim.menus.MenuItem;

/**
 *  Clase concreta de un robot para este proyecto
 *
 *  Aqui implementamos el patron de diseño State para modelar
 *  los distintos cambios de estado que nuestro robot experimentará a lo largo
 *  del programa.
 *
 *  Para esto, todas las acciones posibles que pueda realizar el robot
 *  son designadas a su estado interno. (vease StateRobot estado)
 *
 *  Empieza en su estado inicial que es encendido.
 *  */
package com.rateroscoloniatesocongo.robot.*;
import  com.rateroscoloniatesocongo.menus;
import  com.rateroscoloniatesocongo.menus.Iteradores.*;
public class Robot{
	private Estado StateRobotEncendido;
	private Estado StateRobotSuspendido;
	private Estado StateRobotCaminando;
	private Estado StateRobotAtendiendo;
	private Estado StateRobotCocinando;
   private Estado StateRobotEntregando;
   private MenuItem platilloAcocinar; 
   private Estado estadoRobot;

    /**
     * Metodo constructor de un robot, que no recibe argumentos.
     */ 
    public Robot(){
       this.StateRobotEncendido = new StateRobotEncendido(this);
       this.StateRobotSuspendido = new StateRobotSuspendido(this);
       this.StateRobotCaminando = new StateRobotCaminando(this);
       this.StateRobotAtendiendo = new StateRobotAtendiendo(this);
       this.StateRobotcocinando = new StateRobotcocinando(this);
       this.StateRobotEntregando = new StateRobotEntregando(this);

       this.estadoRobot = StateRobotEncendido;
    }


    /**Entregando
     * Metodo asignarEstado modifica el estado del robot.
     * @param estadoRobot - tipo Estado. 
     */
    public void asignarEstado(Estado estadoRobot){
       this.estadoRobot = estadoRobot;
    }

    /**
     * Metodo asignarPlaticoAcocinar asignar el platillo que va a cocinar el robot.
     * @param platilloAcocinar - tipo MenuItem. 
     */
    public void asignarPlaticoAcocinar(MenuItem platilloAcocinar){
       this.platilloAcocinar = platilloAcocinar;
    }
    
    /**
     * Metodo obtenerEstadoActual obtiene el estado actual del robot.
     * @return Estado.
     */
    public Estado obtenerEstadoActual(){
      return this.estadoRobot;
    }

    /**
     * Metodo obtenerEstadoSuspendido obtiene el eEntregandostado supendido del robot.
     * @return Estado.StateRobotEncendido
     */    
    public Estado obtenerEstadoSuspendido(){
       return this.StateRobotSuspendido;
    }

    /**
     * Metodo obtenerEstadoEncendido obtiene el estado encendido del robot.
     * @return Estado.
     */    
    public Estado obtenerEstadoEncendido(){
       return this.StateRobotEncendido;
    }
    /**
     * Metodo obtenerEstadoCaminado obtiene el estado caminando del robot.
     * @return Estado.
     */
    public Estado obtenerEstadoCaminando(){
       return this.StateRobotCaminando;
    }
    /**
     * Metodo obtenerEstadoAtendiendo obtiene el estado Atendiendo del robot.
     * @return Estado.
     */
    public Estado obtenerEstadoAtendiendo(){
       return this.StateRobotAtendiendo;
    }
    /**
     * Metodo obtenerEstadoCocinando obtiene el estado concinando del robot.
     * @return Estado.
     */
    public Estado obtenerEstadoCocinando(){
       return this.StateRobotcocinando;	
    }
    /**
     * Metodo obtenerEstadoEntregando obtiene el estado entregado del robot.
     * @return Estado.
     */
    public Estado obtenerEstadoEntregando(){
       return this.StateRobotEntregando;
    }
    /**
     * Metodo obtenerEstadoPlatilloAcocinar obtiene el estado del platillo a cocinar del robot.
     * @return Estado.
     */
    public MenuItem obtenerPlatilloAcocinar(){
       return this.platilloAcocinar;
    }



    public void activar()throws AlertaRobot{
       this.estadoRobot.activar();	
    }
    /**
     *@return estado del robor (encender)
     *@throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot. 
     */
    public String StateRobotEncendido()throws AlertaRobot{
      return this.estadoRobot.StateRobotEncendido();
    }
    /**
     *@return estado del robor (suspender)
     *@throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot.
     */
    public String StateRobotSuspendido()throws AlertaRobot{
       return this.estadoRobot.StateRobotSuspendido();
    }
    /**
     *@return estado del robor (distancia al caminar)
     * @throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot.
     */
    public String StateRobotCaminando(int distancia)throws AlertaRobot{
       return this.estadoRobot.StateRobotCaminando(distancia);	
    }
    /**
     *realiza la accion de ordenar.
     * @param id - el id del platillo.
     * @param menuCompleto - un arreglo del tipo menu.
     * @throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot.
     */    
    public void tomarOrden(int id,Menu[] menuCompleto)throws AlertaRobot{
       this.estadoRobot.tomarOrden(id,menuCompleto);	
    }
    /**
     *@return estado del robor (cocinar)
     * @throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot.
     */
    public String StateRobotcocinando()throws AlertaRobot{
       return this.estadoRobot.StateRobotcocinando();
    }
    /**
     *@return estado del robor (entregar)
     * @throws AlertaRobot :se presentara cuando ocurra un accion invalida para el robot.
     */
    public String StateRobotEntregando()throws AlertaRobot{
       return this.estadoRobot.StateRobotEntregando();	
    }
}
