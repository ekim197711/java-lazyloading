import space.SpaceShip;
import space.ValueHolder;

import java.util.function.Supplier;

public class SpaceApplication {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip(
                new ValueHolder<String>(() -> "Round"),
                new ValueHolder<Integer>(() -> 100)
        );
        System.out.println(spaceShip.getCrew());
        System.out.println(spaceShip.getCrew());
        System.out.println(spaceShip.getCrew());

        SpaceShip square= new SpaceShip(
                new ValueHolder<String>(() -> "Square"),
                new ValueHolder<Integer>(() -> 200)
        );
        SpaceShip pyramid = new SpaceShip(
                new ValueHolder<String>(() -> "Pyramid"),
                new ValueHolder<Integer>(() -> 300)
        );

        square.getCrew();
        square.getName();
        System.out.println(square);
        pyramid.getName();
        pyramid.getCrew();
        System.out.println(pyramid);
    }
}
