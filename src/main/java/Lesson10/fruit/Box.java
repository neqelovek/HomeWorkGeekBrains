package Lesson10.fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Box<T extends Fruit> {


    private List<T> fruits = new ArrayList<>();


    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0F;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return box.getWeight() == getWeight();


    }

    public void checkingFruits(Box<T> box) {
        getFruits().addAll(box.getFruits());
        box.getFruits().clear();

    }

    public void addFruit(T fruit, float amount) {
        IntStream.iterate(0, i -> i < amount, i -> i + 1).forEach(i -> {
              fruits.add(fruit);
        });
    }

}
