package BusinessLayer;
import java.util.Date;
import java.util.ArrayList;
import DataAccess.OrderDataManager;

public class Order {
  private int customerID;
    private ArrayList<OrderItem> orderItems = new ArrayList<OrderItem> (5);
    private Date orderDate;
    private int orderNumber;
    
        public void add() {
        OrderDataManager.add(this);
    }
    
    public void addItem(OrderItem item) {
        System.out.println("Inside Order.addItem\n  " + item);
        orderItems.add(item);
        item.setLineNumber(orderItems.size());
    }
    
    public static Order createOrder(Customer c){
        Order order = new Order();
        order.setCustomerID(c.getCustomerID());
        order.setOrderDate(new Date());
        return order;
    }
    
    public static ArrayList<Order> findCustomerOrders(int customerID){
        return OrderDataManager.findCustomerOrders(customerID);
    }
    
    public static Order get(int i) {
        return OrderDataManager.get(i);
    }
    
    
    
    
    
    //gets and sets

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

     public String toString() {
        String returnString;
        returnString = orderNumber + "   " + orderDate.toString() + " Customer: " + customerID;
        for(int i = 0; i < orderItems.size(); i++) {
            returnString = returnString + "\n     " + orderItems.get(i);
        }
        
        return returnString;
    }
    
}
