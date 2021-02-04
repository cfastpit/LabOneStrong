package BusinessLayer;


public class OrderItem {
    private String orderNumber;
   private String lineNumber;
   private String   productID;
   private String productDescription;
   private int quantity;
   private double Price;
   
   
   
   public OrderItem(String orderNumber, String lineNumber, String productID, String productDescription, int quantity, double Price) {
        this.orderNumber = orderNumber;
        this.lineNumber = lineNumber;
        this.productID = productID;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.Price = Price;
        
        
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderNumber = " + orderNumber + ", lineNumber = " + lineNumber + ", productID = " + productID + ", productDescription = " + productDescription + ", quantity = " + quantity + ", Price = " + Price + '}';
    }
   
    
    
}
