import flower.Flower;
import flower.FlowerType;

public class MyApplication {
    public static void main(String[] args) {
        Flower flower1 = Flower.flowers(FlowerType.HYACINTH);
        System.out.println("Flower: " + flower1);
        Flower flower2 = Flower.flowers(FlowerType.ORCHIDS);
        System.out.println("Flower: " + flower2);
        Flower flower3 = Flower.flowers(FlowerType.LILY);
        System.out.println("Flower: " + flower3);
    }
}
