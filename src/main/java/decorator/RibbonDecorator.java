package decorator;

import flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 40 + super.price();
    }

    @Override
    public String description() {
        return super.description() + ", wrapped with a ribbon";
    }

}
