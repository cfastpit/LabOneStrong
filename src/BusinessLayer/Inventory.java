package BusinessLayer;


public class Inventory {
 
  private String productID;
  private String description;
  private int quantityOnHand;
  private double price;
    
    public Inventory(String productID, String description, int quantityOnHand, double price) {
        this.productID = productID;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    //Gets and Sets

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productID = " + productID + ", description = " + description + ", quantityOnHand = " + quantityOnHand + ", price = " + price + '}';
    }
    
    
}
