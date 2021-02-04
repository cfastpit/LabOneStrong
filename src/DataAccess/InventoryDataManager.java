package DataAccess;

import BusinessLayer.Inventory;
import java.util.ArrayList;

public class InventoryDataManager {
 
    private ArrayList<Inventory> dataStore;

    public InventoryDataManager() {
        this.dataStore = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getAll() {
        return dataStore;
    }
public void create(Inventory productToCreate) {
       
        this.dataStore.add(productToCreate);
    } 
    
}
