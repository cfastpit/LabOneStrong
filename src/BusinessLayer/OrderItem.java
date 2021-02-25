package BusinessLayer;
import DataAccess.OrderItemDataManager;

public class OrderItem {
private String description;
    private int lineNumber;
    private int quantity;
    private double price;
    private int productID;
    
      public void add() {
        OrderItemDataManager.add(this);
    }
    
    public static OrderItem createOrderItem(Inventory inv){
        OrderItem item = new OrderItem();
        item.setProductID(inv.getProductId());
        item.setDescription(inv.getDescription());
        item.setPrice(inv.getPrice());
        return item;
    }
    
    
    //get and sets

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "description=" + description + ", lineNumber=" + lineNumber + ", quantity=" + quantity + ", price=" + price + ", productID=" + productID + '}';
    }
    
    
}
