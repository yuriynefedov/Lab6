package flowers;

import lombok.*;

@Setter @Getter @AllArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private Color color;
    private double price;
    private FlowerType flowerType;
    public Flower() {}

    public boolean equals(Flower obj) {
        return getSepalLength() == obj.getSepalLength() && getColor()==obj.getColor() &&
                getPrice() == obj.getPrice() && getFlowerType() == obj.getFlowerType();
    }

    @Override
    public double price() {
        return switch (flowerType) {
            case Chamomile -> 15.0;
            case Rose -> 20.0;
            case Tulip -> 10;
            case Cactus -> 1000.0;
        };
    }

    @Override
    public String description() {
        return "This flower is a " + this.flowerType + " of color " + this.color + " and price $" + price();
    }
}
