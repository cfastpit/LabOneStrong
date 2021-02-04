import java.util.Arrays;
import BusinessLayer.*;
import DataAccess.*;
import java.util.ArrayList;

public class OrderSystem {

   
    public static void main(String[] args) {
    
          CustomerDataManager customerDm = new CustomerDataManager();
        ProductDataManager productDm = new ProductDataManager();
        OrderDataManager orderDM = new OrderDataManager();
        OrderItemDataManager orderItemDm = new OrderItemDataManager();

        Customer customer1 = new Customer(100, "Bob", "Smith", "555-432-5490");
        Customer customer2 = new Customer(200, "Mark", "Jones ", "555-254-5440");
        Customer customer3 = new Customer(300, "Jhon", "Doe", "555-215-5699");

        Product product1 = new Product("1", "soap", 5, 12.44);
        Product product2 = new Product("2", "Icecream", 5, 2.44);
        Product product3 = new Product("3", "Gum", 5, 1.44);

        Order order1 = new Order("10", "100", "5/5/2020");
        Order order2 = new Order("20", "200", "5/5/2020");
        Order order3 = new Order("30", "300", "5/5/2020");

        OrderItem orderItem1 = new OrderItem("10", "1", "2", "Icecream", 1, 2.44);
        OrderItem orderItem2 = new OrderItem("10", "2", "1", "soap", 1, 2.44);
        OrderItem orderItem3 = new OrderItem("20", "3", "1", "soap", 2, 24.88);
        OrderItem orderItem4 = new OrderItem("20", "4", "2", "Icecream", 2, 4.88);
        OrderItem orderItem5 = new OrderItem("30", "5", "3", "Gum", 2, 2.88);
        OrderItem orderItem6 = new OrderItem("30", "6", "2", "Icecream", 1, 2.44);

        //create
        customerDm.create(customer1);
        customerDm.create(customer2);
        customerDm.create(customer3);

        productDm.create(product1);
        productDm.create(product2);
        productDm.create(product3);

        orderItemDm.create(orderItem1);
        orderItemDm.create(orderItem2);
        orderItemDm.create(orderItem3);
        orderItemDm.create(orderItem4);
        orderItemDm.create(orderItem5);
        orderItemDm.create(orderItem6);

        orderDM.create(order1);
        orderDM.create(order2);
        orderDM.create(order3);

        //arraylist for business Layer
        ArrayList<Customer> customersFromDatabase = customerDm.getAll();
        for (Customer dbCustomer : customersFromDatabase) {
            System.err.println(dbCustomer);
        }
        
         ArrayList<Product> productFromDatabase = productDm.getAll();
        for (Product dbpProduct : productFromDatabase) {
            System.err.println(dbpProduct);
        }
         ArrayList<Order> orderFromDatabase = orderDM.getAll();
        for (Order dbOrder : orderFromDatabase) {
            System.err.println(dbOrder);
        }
        
         ArrayList<OrderItem> orderItemFromDatabase = orderItemDm.getAll();
        for (OrderItem dbOrderItem : orderItemFromDatabase) {
            System.err.println(dbOrderItem);
        }
        
        
        /*
        
        */
    }
    
}
