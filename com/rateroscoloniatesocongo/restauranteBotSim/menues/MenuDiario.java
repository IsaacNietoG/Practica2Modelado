package com.rateroscoloniatesocongo.restauranteBotSim.menues;

/**
 *  Este es el menu general del restaurante
 *
 *  El numero de hamburguesas ofrecidas es inamovible por lo que podemos
 *  usar un arreglo libremente y de la misma manera utilizamos el iterador
 *  que diseñamos para esta aplicación.
 *  */
private MenuItem[] items;
    private int indice = 0;
    
    public MenuDiario(int numeroDeMenus){
      this.items = new MenuItem[numeroDeMenus];	
    }

    public void agregarItem(int id,String nombrePlatillo,String descripcion,double precioPlatillo,boolean tieneQueso,boolean esVegetariana){
      if(indice < items.length){
         MenuItem menu = new MenuItem(id,nombrePlatillo,descripcion,precioPlatillo,tieneQueso,esVegetariana);
         this.items[indice] = menu;
         indice = indice+1;
      }	   
    }


    @Override
    public Iterador crearIterador() {
       return new MenuDiarioIterator(this.items);
    }

    @Override
    public MenuItem buscarMenuId(int id) {
        for(int i = 0; i<this.items.length;i++){
          if(this.items[i].obtenerId() == id){
              return this.items[i];
          }
       }
       return null;
    }

    @Override
    public String obtenerNombreMenu() {
           return "Menu diario";
    }
}
