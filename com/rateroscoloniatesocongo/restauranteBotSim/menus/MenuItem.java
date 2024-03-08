package com.rateroscoloniatesocongo.restauranteBotSim.menus;

import com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas.HamburguesaReceta;

/**
 *  La clase que guarda la informacion de un item en un menu
 *
 *  Para este proyecto, nosotros debemos de realizar una emulacion de un restaurante de hamburguesas, por lo que,
 *  para este caso concreto, nuestra clase MenuItem nos guardará toda la información necesaria sobre cada uno de las
 *  hamburguesas.
 *
 *  Esto abarca tanto informacion de display como la información que necesita nuestro Robot para realizar la hamburguesa, es
 *  decir, la receta de la hamburguesa.
 *  */
public class MenuItem{

    int id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;
    HamburguesaReceta receta;

    public MenuItem(int id, String nombre, String descripcion, double precio, boolean tieneQueso,
                    boolean esVegetariano, HamburguesaReceta receta){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;
        this.receta = receta;
        
    }
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public boolean tieneQueso(){
        return tieneQueso;
    }

    public boolean esVegetariano(){
        return esVegetariano;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setTieneQueso(boolean tieneQueso){
        this.tieneQueso = tieneQueso;
    }

    public void setEsVegetariano(boolean esVegetariano){
        this.esVegetariano = esVegetariano;
    }

    public void setReceta(HamburguesaReceta receta){
        this.receta = receta;
    }
}
