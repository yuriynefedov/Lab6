package decorator;

import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    Item flower = new Flower(15.0, Color.Red, 12.0, FlowerType.Cactus);

    @BeforeEach
    void setUp() {
        flower = new BasketDecorator(flower);
    }

    @Test
    void description() {
        assertEquals("This flower is a Cactus of color Red and price $1000.0, put in a basket", flower.description());
    }
}