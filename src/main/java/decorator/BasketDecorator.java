package decorator;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 4 + super.price();
    }

    @Override
    public String description() {
        return super.description() + ", put in a basket";
    }

}
