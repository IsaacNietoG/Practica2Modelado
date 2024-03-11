package com.rateroscoloniatesocongo.restauranteBotSim;
import  com.rateroscoloniatesocongo.hamburguesas*;
import  om.rateroscoloniatesocongo.robot.*;
import  com.rateroscoloniatesocongo.menus*;
import  com.rateroscoloniatesocongo.Menu.Iteradores.*;
import  java.util.Scanner;
import  java.util.InputMismatchException;
public class Main{
  public static final String reset = "\u001B[0m";
  public static final String colorLetraBlanco = "\u001B[37m";
  public static final String fondoRojo = "\u001B[41m";
  public static final String fondoRosaClaro = "\u001B[48;5;217m";
  public static final String fondoAqua = "\u001B[46m";

	public static void main(String[] args){
    Robot robot = new Robot();
    boolean salirMenuInteractivo = false;
    while(!salirMenuInteractivo){
      try{
        int opcion = menuInteractivo(robot);
        String resultado =  opcionesRobot(opcion,robot);
        System.out.println(fondoRosaClaro + colorLetraBlanco + resultado + reset);
      }catch(InputMismatchException e){
        System.out.println(fondoRojo + colorLetraBlanco + "Ingresa Valores numèricos ¡LOL!" + reset);
      }catch(OpcionInvalida e){
        System.out.println(fondoRojo + colorLetraBlanco + e + reset);
      }catch(AlertaRobot e){
        System.out.println(fondoRojo + colorLetraBlanco + e + reset);
      }
    }
  }

    /**
     *@return opcion
     */
  public static int menuInteractivo(Robot robot)throws InputMismatchException{
    int opcion = 0;
    AdornarTexto texto = new AdornarTexto("Menu Interactivo 🤖");
    Scanner pregunta = new Scanner(System.in);
    String menu  = texto.ponerContorno("*");
    System.out.println("\n" + menu + "\n");
    texto.asignarTexto("Bienvenido ^^");
    String saludo = texto.ponerContorno("*");
    System.out.println(saludo + "\n");
    texto.asignarTexto("Ingrese una opciòn: ");
    String barra = texto.ponerContornoADosTextos("Estado: " + robot.obtenerEstadoActual().toString(),"*");
    System.out.println(barra + "\n");
    System.out.println("→  1. encender");
    System.out.println("→  2. suspender");
    System.out.println("→  3. activar");
    System.out.println("→  4. caminar");
    System.out.println("→  5. tomar orden");
    System.out.println("→  6. cocinar");
    System.out.println("→  7. entregar orden");
    System.out.println("→  8. salir");
    opcion = pregunta.nextInt();    
    return opcion;
  }

    /**
     *@return resultado
     */
  public static String opcionesRobot(int i,Robot robot)throws OpcionInvalida,AlertaRobot{
    String resultado = "";
    switch(i){
      case 1:
        resultado = robot.encender();
        break;
      case 2:
        resultado = robot.suspender();
        break;
      case 3:
        robot.activar();
        break;
      case 4:
        resultado = robot.caminar(100);
        break;
      case 5:
        AdornarTexto texto = new AdornarTexto("Menu");
        Scanner pregunta = new Scanner(System.in);
        MenuCadaDia menuCadaDia = new MenuCadaDia();
        MenuEspecial menuEspecial = new MenuEspecial();
        MenuDiario menuDiario = new MenuDiario(3);
        Menu[] menuCompleto = crearMenuCompleto(menuCadaDia,menuEspecial,menuDiario);
        imprimirMenuCompleto(menuCompleto);
        System.out.println("Introduzca el id del plato que quieres: ");
        int id = pregunta.nextInt();
        robot.tomarOrden(id,menuCompleto);
        break;
      case 6:
        resultado = robot.cocinar();
        break;
      case 7:
        resultado = robot.entregar();
        break;
      case 8:
        System.exit(0);
        break;
      default:
       throw new OpcionInvalida("INGRESA UNA OPCIÒN VALIDAAAAA!");  
    }
    return resultado;
  }


  public static void imprimirMenu(Iterator iterador){
    while(iterador.hasNext()){
      MenuItem menu = iterador.next();
      System.out.println(menu.toString() + "\n");
    }
  }

  public static void imprimirMenuCompleto(Menu[] menuCompleto){
    for(int i = 0; i<menuCompleto.length;i++){
      AdornarTexto texto = new AdornarTexto(menuCompleto[i].obtenerNombreMenu());
      System.out.println(fondoVerde + colorLetraBlanco + texto.ponerContorno("*") + reset + "\n" + reset);
      imprimirMenu(menuCompleto[i].crearIterador());
    }
  }
    /**
     *@return menuCompleto
     */
  public static Menu[] crearMenuCompleto(MenuCadaDia menuCadaDia,MenuEspecial menuEspecial,MenuDiario menuDiario){
    Menu[] menuCompleto = new Menu[3]; 
    menuCadaDia.agregarItem(312,"Hamburguesa del Mar","hamburguesa que huele a mar xd y sabe a Mar (es pesca`o)",90.0,false,false);
    menuCadaDia.agregarItem(314,"Hamburguesa hawai","Las cosas con piña saben mejor, guiño, guiño",110.0,true,false);
    menuCadaDia.agregarItem(313,"Hamburguesa Europas", "Parecerà que sales de tu pueblito, y viajas a las europas",100.0,false,false);
    menuCompleto[0] = menuCadaDia;

    menuEspecial.agregarItem(315,"Hamburguesa Chancho", "Es la especialidad de la casa, tiene carne de vacas sagradas",95.0,true,true);
    menuEspecial.agregarItem(316,"Hamburguesa simple", "incluye papás y es normal, muy equis...",82.00,true,false);
    menuEspecial.agregarItem(317,"Hamburguesa Premium", "Es las màs rica, el pan tiene lagrimas de la virgen de guadalupe",400.0,true,false);
    menuCompleto[1] = menuEspecial;

    menuDiario.agregarItem(319,"hamburguesa de pollo","hamburguesa de pollito pio (Tiene verdura)",80.0,true,false);
    menuDiario.agregarItem(318,"hamburguesa de carne y queso","hamburguesa con quesito",120.0,true,false);
    menuDiario.agregarItem(311,"hamburguesa de vegana","hamburguesa de soya, sabe a carne, pero no es carne xd",100.0,true,true);
    menuCompleto[2] = menuDiario;

    return menuCompleto;
  }





}


