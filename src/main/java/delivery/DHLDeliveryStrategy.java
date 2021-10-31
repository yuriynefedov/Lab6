package delivery;

import flowers.Item;
import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Items were delivered by DHL™. Here is a list:");
        for (Item item: items) {
            System.out.println(item.description());
        }
    }
}
