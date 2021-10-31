package decorator;

import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    Item flower = new Flower(15.0, Color.Red, 12.0, FlowerType.Cactus);

    @BeforeEach
    void setUp() {
        flower = new RibbonDecorator(flower);
    }

    @Test
    void description() {
        assertEquals("This flower is a Cactus of color Red and price $1000.0, wrapped with a ribbon", flower.description());
    }
}