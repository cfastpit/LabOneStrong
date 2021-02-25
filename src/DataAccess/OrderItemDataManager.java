package DataAccess;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

public class OrderItemDataManager {
 
private static ArrayList<OrderItem> items = new ArrayList<OrderItem>(5);
    
    public static void add(OrderItem item) {
        items.add(item);
    }
}
