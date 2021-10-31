package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import flowers.Color;
import flowers.Item;
import flowers.Flower;
import flowers.FlowerType;

import java.util.ArrayList;
import java.util.List;

class PostDeliveryStrategyTest {

    PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
    List<Item> items = new ArrayList<>();
    String expectedResult = "Items were delivered by DHL™. Here is a list:\n" +
            "This flower is a Rose of color Red and price $20.0\n" +
            "This flower is a Chamomile of color White and price $15.0\n" +
            "This flower is a Cactus of color Purple and price $1000.0";

    @BeforeEach
    void setUp() {
        Flower flower1 = new Flower(15.0, Color.Red, 12.0, FlowerType.Rose);
        Flower flower2 = new Flower(12.0, Color.White, 12.0, FlowerType.Chamomile);
        Flower flower3 = new Flower(15.0, Color.Purple, 12.0, FlowerType.Cactus);
        items.add(flower1);
        items.add(flower2);
        items.add(flower3);
    }

    @Test
    void deliver() {
        postDeliveryStrategy.deliver(items);
    }
}