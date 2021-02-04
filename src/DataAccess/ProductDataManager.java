package DataAccess;

import BusinessLayer.Product;
import java.util.ArrayList;

public class ProductDataManager {
 
    private ArrayList<Product> dataStore;

    public ProductDataManager() {
        this.dataStore = new ArrayList<Product>();
    }

    public ArrayList<Product> getAll() {
        return dataStore;
    }
public void create(Product productToCreate) {
       
        this.dataStore.add(productToCreate);
    } 
    
}
