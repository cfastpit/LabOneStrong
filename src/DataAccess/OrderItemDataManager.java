package DataAccess;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

public class OrderItemDataManager {
 
   private ArrayList<OrderItem> dataStore;

    public OrderItemDataManager() {
        this.dataStore = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getAll() {
        return dataStore;
    }
public void create(OrderItem orderItemToCreate) {
     
        this.dataStore.add(orderItemToCreate);
    } 
    
}
