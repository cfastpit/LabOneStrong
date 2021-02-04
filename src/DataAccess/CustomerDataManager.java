
package DataAccess;

import BusinessLayer.Customer;
import java.util.ArrayList;
public class CustomerDataManager {
    private ArrayList<Customer> dataStore;
    
    public CustomerDataManager() {
        this.dataStore = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getAll() {
        return dataStore;
    }
    public void create(Customer customertToCreate) {
        
        this.dataStore.add(customertToCreate);
    }
}
