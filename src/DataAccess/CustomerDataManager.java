package DataAccess;

import BusinessLayer.Customer;
import java.util.ArrayList;



public class CustomerDataManager {
    private static  ArrayList<Customer> customerList = new ArrayList<Customer> (5);
    
   public static void add(Customer c) {
        customerList.add(c);
    }
    
 public static Customer find(int id) {
        for(int i = 0; i < customerList.size(); i++)
            if(customerList.get(i).getCustomerID() == id)
                return customerList.get(i);
        return null;
    }
    
    public static Customer get(int i) {
        return customerList.get(i);
    }
    
    public static int getNumberOfCustomers() {
        return customerList.size();
    }
    
    public static void initialize(){
        Customer c;
    c = new Customer();
      c.setCustomerID(100);
      c.setFirstName("Customer");
      c.setLastName("One");
      c.setPhoneNumber("555-5558704");
      c.add(); 
      
        c = new Customer();
      c.setCustomerID(200);
      c.setFirstName("Customer");
      c.setLastName("Two");
      c.setPhoneNumber("555-5558704");
      c.add(); 
      
        c = new Customer();
      c.setCustomerID(300);
      c.setFirstName("Customer");
      c.setLastName("Three");
      c.setPhoneNumber("555-5558704");
      c.add(); 
    
}
    }
    
