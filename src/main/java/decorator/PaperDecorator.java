package decorator;

import flowers.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 13 + super.price();
    }

    @Override
    public String description() {
        return super.description() + ", wrapped in paper";
    }

}
