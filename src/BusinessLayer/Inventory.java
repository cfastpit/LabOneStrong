package BusinessLayer;
import DataAccess.InventoryDataManager;
import java.util.ArrayList;
public class Inventory {
 
    String description;
    private double price;
    private int productId;
    private int quantityOnHand;
    
    
    public void add() {
        InventoryDataManager.add(this);
    }
    
    public static Inventory find(int id) {
        return InventoryDataManager.find(id);
    }

    
    public static Inventory get(int i){
        return InventoryDataManager.get(i);
    }
    

    
    public static void initialize(){
        InventoryDataManager.initialize();
    }

    
    
    
    public static int getNumberOfInventory(){
        return InventoryDataManager.getNumberOfInventory();
    }
    //get and sets

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    @Override
    public String toString() {
        return "Inventory{" + "description=" + description + ", price=" + price + ", productId=" + productId + ", quantityOnHand=" + quantityOnHand + '}';
    }
    
  
}
