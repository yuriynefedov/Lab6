package delivery;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Items were delivered by The National Post. Here is an item list:");
        for (Item item: items) {
            System.out.println(item.description());
        }
    }
}
