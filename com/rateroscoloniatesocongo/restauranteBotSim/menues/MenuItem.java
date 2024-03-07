package com.rateroscoloniatesocongo.restauranteBotSim.menues;

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
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        //....
    }
    public int getId(){
        return id;
    }

    public String getNombre(){

    }

    public String getDescripcion(){

    }

    public double getPrecio(){

    }

    public boolean tieneQueso(){

    }

    public boolean esVegetariano(){

    }

    public void setId(int id){

    }

    public void setNombre(String nombre){

    }

    public void setDescripcion(String descripcion){

    }

    public void setPrecio(double precio){

    }

    public void setTieneQueso(boolean tieneQueso){

    }

    public void setEsVegetariano(boolean esVegetariano){

    }

    public void setReceta (HamburguesaReceta receta){

    }
}
