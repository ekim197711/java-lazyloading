package flower;

import java.util.HashMap;
import java.util.Map;

public class Flower {
    private String name;
    private FlowerType flowerType;

    private static Map<FlowerType, Flower> map = new HashMap<>();

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        this.name = this.flowerType.name();
    }

    public static Flower flowers(FlowerType flowerType){
        synchronized (map) {
            if (map.containsKey(flowerType) == false) {
                map.put(flowerType, new Flower(flowerType));
            }
        }
        System.out.println(map);
        return map.get(flowerType);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", flowerType=" + flowerType +
                '}';
    }
}
