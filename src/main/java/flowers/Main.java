package flowers;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(15.0, Color.Red, 12.0, FlowerType.Rose);
        System.out.println(flower.description());
        FlowerPack flowerPack = new FlowerPack(flower, 15);
        System.out.println(flowerPack.description());
    }
}
