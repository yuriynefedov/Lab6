package decorator;

import flowers.Item;

public abstract class ItemDecorator extends Item {
    private Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }

    @Override
    public String description() {
        return item.description();
    }
}