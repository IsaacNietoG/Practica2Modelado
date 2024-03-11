package com.practica2.demo.hamburguesaNormal;
import  com.practica2.demo.AdornarTexto;
public class HamburguesaVegetariana extends Hamburguesa{

   public HamburguesaVegetariana(){
   	  this.hamburguesaPreparada = "";
   }

    /**
     *@Override
     */
   public void prepararCarne(){
     AdornarTexto texto = new AdornarTexto("Coccion");
     String coccion = texto.ponerContorno("*");
     String descripcion = "se esta cocciendo la carne, que es ha base de frijol y lentejas guacala !!!";
     this.prepararCarne =  coccion + "\n" + descripcion;
   }

    /**
     *@Override
     */
   public void ponerCarne(){
   	String carneVegetariana = "🫘" + "🌾";
   	this.hamburguesaPreparada += carneVegetariana  + "\n";
   }
}
