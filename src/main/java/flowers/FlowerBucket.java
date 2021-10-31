package flowers;

import lombok.*;
import java.util.ArrayList;

public class FlowerBucket extends Item {

    @Getter
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();



    public boolean searchFlower(Flower flower) {
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.getFlower() == flower) {
                return true;
            }
        }
        return false;
    }

    public void addFlowers(Flower flower, int amount) {
        FlowerPack newFlowerPack = new FlowerPack(flower, amount);
        flowerPacks.add(newFlowerPack);
    }

    @Override
    public double price() {
        return 0;
    }
}
