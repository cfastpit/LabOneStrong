import java.util.Arrays;
import BusinessLayer.*;

import java.util.ArrayList;

public class OrderSystem {

   
    public static void main(String[] args) {
  int i,n;
        Customer customer;
        Order order;
        OrderItem item;
        ArrayList<Order> orders;
        
        Customer.initialize(); 
        Inventory.initialize();
        
        customer = Customer.find(100);
        order = Order.createOrder(customer);
        item = OrderItem.createOrderItem(Inventory.find(100));
        item.setQuantity(2);
        order.addItem(item);
        order.add();
        
        customer = Customer.find(200);
        order = Order.createOrder(customer);
        item = OrderItem.createOrderItem(Inventory.find(200));
        item.setQuantity(3);
        order.addItem(item);
        item = OrderItem.createOrderItem(Inventory.find(300));
        item.setQuantity(4);
        order.addItem(item);
        order.add();
        
        customer = Customer.find(300);
        order = Order.createOrder(customer);
        item = OrderItem.createOrderItem(Inventory.find(100));
        item.setQuantity(1);
        order.addItem(item);
        item = OrderItem.createOrderItem(Inventory.find(300));
        item.setQuantity(2);
        order.addItem(item);
        order.add();
        
        for (i = 0; i < Inventory.getNumberOfInventory(); i++){
            System.out.println(Inventory.get(i));
        }
        
        for(i = 0; i < Customer.getNumberOfCustomers(); i++){
            customer = Customer.get(i);
            System.out.println(customer);
            orders = Order.findCustomerOrders(customer.getCustomerID());
            for (n = 0; n < orders.size(); n++){
                System.out.println(orders.get(n));
            }
        }
    }
}
