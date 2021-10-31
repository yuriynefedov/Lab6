package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack extends Item {
    private final Flower flower;
    private final int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    @Override
    public double price() {
        return this.flower.price() * this.amount;
    }

    @Override
    public String description() {
        return "This flower pack consists of " + this.flower.getFlowerType() + " flowers and costs $" + this.price();
    }

    public boolean equals(FlowerPack obj) {
        return this.getFlower().equals(obj.getFlower()) && this.getAmount()==obj.getAmount();
    }
}
