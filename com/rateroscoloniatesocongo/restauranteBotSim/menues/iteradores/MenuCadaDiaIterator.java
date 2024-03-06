import java.util.ArrayList;

import com.rateroscoloniatesocongo.restauranteBotSim.menues.MenuItem;

public class MenuCadaDiaIterator implements Iterador{

    private ArrayList<MenuItem> items;
    private int posicion;

    public MenuCadaDiaIterator(ArrayList<MenuItem> items){
        this.items = items;
        posicion = 0;
    }

    public boolean hasNext(){
        return (this.items.size()>posicion);
    }

    public MenuItem next(){
        MenuItem retorno = items.get(posicion);
        posicion++;
        return retorno;
    }
}
