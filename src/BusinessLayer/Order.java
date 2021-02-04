
package BusinessLayer;


public class Order {
    private String orderNumber;
    private String customerID;
    private String date;
    
    public Order(String orderNumber, String customerID, String date) {
        this.orderNumber = orderNumber;
        this.customerID = customerID;
        this.date = date;
        
     //get and sets
     
     
        
        
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber = " + orderNumber + ", customerID = " + customerID + ", date = " + date + '}';
    }
    
    
    
}
